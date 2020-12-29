package com.example.demo.boot;

import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public interface MySpring {


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
     * *2.ApplicationContext --- BeanFactory 子接口项目加载的时候就会创建
     *      ---ClassPathXmlApplicationContext
     *      ---FileSystemXmlApplicationContext
     *
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
     ***Bean生命周期
     *      1、对象实例化（无参构造）
     *      2、属性注入
     *      3、init-method初始化
     *      4、使用bean
     *      5、DiposibleBean.destory()销毁
     *
     */

}
