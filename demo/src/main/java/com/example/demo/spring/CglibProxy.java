package com.example.demo.spring;

import com.example.demo.spring.mgr.AopMgrImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    Logger logger = LoggerFactory.getLogger(getClass());

    private AopMgrImpl aopMgrImpl;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("cglib start...");
//        Object invoke = method.invoke(aopMgrImpl, objects);
        Object invoke1 = methodProxy.invokeSuper(o, objects);
        logger.info("cglib end...");
        return invoke1;
    }

    @Test
    public void test() {
        Enhancer enhancer = new Enhancer();
        //设置要增强的对象
        enhancer.setSuperclass(AopMgrImpl.class);
        //设置回调对象
        enhancer.setCallback(new CglibProxy());
        AopMgrImpl aopMgr = (AopMgrImpl) enhancer.create();
        aopMgr.execute();
    }
}
