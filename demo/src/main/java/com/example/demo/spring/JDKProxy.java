package com.example.demo.spring;

import com.example.demo.spring.mgr.AopMgr;
import com.example.demo.spring.mgr.AopMgrImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        AopMgr aopMgrProxy = (AopMgr) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                (Class<?>[]) Arrays.asList(AopMgr.class).toArray(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        logger.info("proxy start...,method:{}",method.getName());
                        Object invoke = method.invoke(new AopMgrImpl(), args);
                        logger.info("proxy end...");
                        return invoke;
                    }
                });

        aopMgrProxy.execute();
    }
}
