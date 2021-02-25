package com.example.demo.boot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//@Conditional(ConditionalOnBean.class)
public interface MyEnableAutoConfiguration {

    public static final String FACTORIES_RESOURCE_LOCATION = "META-INF/spring.factories";
    /**
     *  总结：Springboot启动会加载大量的启动配置类，通过@EnableAutoConfiguration注解
     *       将"META-INF/spring.factories"中EnableAutoConfiguration相关的值加载到对应的XxxProperties类中
     *       所有在配置文件中能配置的属性都是在 xxxProperties 类中封装着；配置文件能配置什么就可以参照某个功能对应的这个属性类
     *       例如HttpProperties。
     *
     *       xxxAutoConfiguration：自动配置类给容器中添加组件。
     *       xxxProperties：封装配置文件中相关属性。
     *
     *       @EnableAutoConfiguration：启用 SpringBoot 的自动配置机制
     *       @ComponentScan： 扫描被@Component (@Service,@Controller)注解的 bean，注解默认会扫描该类所在的包下所有的类。
     *       @Configuration：允许在 Spring 上下文中注册额外的 bean 或导入其他配置类
     *
     *   源码走读：
     *    @SpringbootApplication
     *      -@SpringBootConfiguration
     *      -@ComponentScan
     *      -@EnableAutoConfiguration
     *          --@AutoConfigurationPackage
     *          --@Import(AutoConfigurationImportSelector.class)
     *              (将类路径下 META-INF/spring.factories 里面配置的所有 EnableAutoConfiguration 的值加入到 Spring 容器中。)
     *          1.selectImports(AnnotationMetadata annotationMetadata)
     *          2.getAutoConfigurationEntry(AutoConfigurationMetadata autoConfigurationMetadata, AnnotationMetadata annotationMetadata)
     *          3.getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes)
     *          4.loadFactoryNames(Class<?> factoryType, @Nullable ClassLoader classLoader)
     *          5.loadSpringFactories(@Nullable ClassLoader classLoader)
     *          6.classLoader.getResources(FACTORIES_RESOURCE_LOCATION) :
     * 			  ClassLoader.getSystemResources(FACTORIES_RESOURCE_LOCATION));
     *
     *
     *      8000字的Spring/SpringBoot常用注解总结 ---- https://zhuanlan.zhihu.com/p/135987318
     *
     */
}
