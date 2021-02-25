package com.example.demo.boot;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Vaule(${xxx}) Spring提供
 * @ConfigrationProperties Springboot提供
 * Environment
 * System.set(key,value)
 */

@Component
// value = "ytz" prefix = "ytz"效果看起来一样
@ConfigurationProperties(value = "ytz", ignoreInvalidFields = true, ignoreUnknownFields = true)
@Configuration
public class MyConfigurationProperties implements InitializingBean {

    @Autowired
    Environment env;

    private Integer age;

    private String name;

    @Bean
    ApplicationRunner ApplicationRunner1() {
        return (ApplicationArguments args) -> {
            System.out.println("----------env.get():" + env.getProperty("ytz.name"));
        };
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //设置环境变量到application.properties文件
        System.setProperty("ytz.name", "彭于晏");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
