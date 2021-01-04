package com.example.demo.spring;

import org.springframework.aop.framework.DefaultAopProxyFactory;

public class MyAop extends DefaultAopProxyFactory {
    /**
     * AOP
     * 动态代理两种：
     *     1、JDK动态代理
     *         java动态代理是利用反射机制生成一个实现代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理。
     *     2、Cglib动态代理
     *         而cglib动态代理是利用asm开源包，对代理对象类的class文件加载进来，通过修改其字节码生成子类来处理
     *
     *     3、如何选择
     *          config.isOptimize()：是否优化，看到否的逻辑是JDK，就可以知道Spring认为CGLIB动态代理的性能更高点。。。
     *          config.isProxyTargetClass()：是否直接代理目标类以及任何接口
     *          hasNoUserSuppliedProxyInterfaces(config)：是否没有指定代理接口
     *          targetClass.isInterface()：确定指定的对象是否表示接口类型
     *          Proxy.isProxyClass(targetClass)：是否是代理类
     *      总结：
     *          1、在代理对象不是借口类型或不是代理类时，指定proxyTargetClass=true后，执行CGLIB代理
     *          2、代理对象是接口类型或是代理类，使用JDK代理
     *     源码：
     *     public AopProxy createAopProxy(AdvisedSupport config) throws AopConfigException {
     * 		if (config.isOptimize() || config.isProxyTargetClass() || hasNoUserSuppliedProxyInterfaces(config)) {
     * 			Class<?> targetClass = config.getTargetClass();
     * 			if (targetClass == null) {
     * 				throw new AopConfigException("TargetSource cannot determine target class: " +
     * 						"Either an interface or a target is required for proxy creation.");
     *                        }
     * 			if (targetClass.isInterface() || Proxy.isProxyClass(targetClass)) {
     * 				return new JdkDynamicAopProxy(config);
     *            }
     * 			return new ObjenesisCglibAopProxy(config);* 		}
     * 		else {
     * 			return new JdkDynamicAopProxy(config);
     *        }
     *    }
     */


    /**
     * 术语：
     *      1、连接点：类中可以被增强的方法
     *      2、切入点：实际增强的方法
     *      3、通知（增强）：切面逻辑
     *          前置通知
     *          后置通知
     *          环绕通知
     *          异常通知
     *          最终通知
     *      4、切面
     *
     */

}
