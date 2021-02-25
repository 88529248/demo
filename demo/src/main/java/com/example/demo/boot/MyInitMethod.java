package com.example.demo.boot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyInitMethod implements InitializingBean {

    /**
     *construct > @Autowired > postConstruct > InitializingBean > ApplicationRunner > ApplicationRunner
     *ApplicationRunner,ApplicationRunner是容器启动成功之后的回调
     */
    @PostConstruct
    void postConstruct(){
        System.out.println("----------postConstruct");

    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("----------afterPropertiesSet");
    }

    @Bean
    ApplicationRunner ApplicationRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println("----------ApplicationRunner");
            }
        };

    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("----------commandLineRunner");
            }
        };
    }


}
