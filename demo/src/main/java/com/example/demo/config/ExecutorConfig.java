package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableAsync
public class ExecutorConfig {

    @Bean
    public Executor myExecutor() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = new ThreadPoolExecutor(2,
                5, 5, TimeUnit.MINUTES,
                new LinkedBlockingDeque<>(10),
                new ThreadPoolExecutor.CallerRunsPolicy());
        return threadPoolExecutor;
    }


}
