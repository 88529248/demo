package com.example.demo.spring;

import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class MyIOC extends InstantiationAwareBeanPostProcessorAdapter {


    /**
     * *IOC:控制反转
     * 实现原理：
     * 1、解析xml文件（xmlBean注入方式）
     * 2、反射获取Clazz
     * 3、对象工厂生成Bean
     *
     ** 对象工厂接口：
     * *1.BeanFactory   ---懒加载，初始化xml文件时不会创建对象
     *                      获取对象时才会创建，spring自己用
     * *2.ApplicationContext --- BeanFactory子接口，项目加载的时候就会创建
     *      ---ClassPathXmlApplicationContext
     *      ---FileSystemXmlApplicationContext
     *  BeanFactory和FactoryBean区别？？？
     *
     * *IOC管理Bean（创建对象、注入属性）
     *      方式：
     *      1、xml方式 2、注解方式
     *** Bean作用域：
     *      1、在Spring中可以设置bean是单实例还是多实例（默认单例）
     *      xml方式中使用scope参数设置
     *
     *      1）singleton 单实例
     *             创建：加载配置文件、容器初始化时创建
     *             销毁：容器关闭的时候
     *      2)prototype 多实例
     *             创建：调用getBean（）方法时创建
     *             销毁：容器不会管理这个bean
     *      3）request
     *
     ***Bean生命周期
     *      1、对象实例化（无参构造）
     *      2、属性注入
     *      3、init-method初始化
     *      4、使用bean
     *      5、容器
     *
     *    1、实例化 BeanFactoryPostProcessor重写postProcessBeanFactory（）
     *    2、实例化 BeanPostProcessor
     *    3、实例化 InstantiationAwareBeanPostProcessorAdapter （BeanPostProcessor子类）
     *    4、InstantiationAwareBeanPostProcessorAdapter调用postProcessBeforeInstantiation（）
     *    5、自定义Bean无参构造实例化
     *    6、InstantiationAwareBeanPostProcessor调用postProcessAfterInstantiation方法
     *    7、InstantiationAwareBeanPostProcessor调用postProcessPropertyValues（）
     *    8、自定义Bean注入属性set（）
     *    9、自定义Bean实现BeanNameAware，调用setBeanName（）
     *    10、自定义Bean实现BeanFactoryAware，调用setBeanFactory()
     *    11、BeanPostProcessor调用postProcessBeforeInitialization对属性进行更改
     *    12、自定义BeanInitializingBean接口、调用afterProperties()
     *    13、调用Bean指定的init-method方法（bean.xml文件中配置）
     *    14、BeanPostProcessor调用postProcessAfterInitialization对属性进行更改
     *    15、ApplicationContext容器初始化完成
     *    16、调用applicationContext.close()
     *    17、调用自定义Bean的destroy-method属性指定的初始化方法
     *
     */

}
