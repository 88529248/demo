package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Aspect
public class MyAspect {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(@com.example.demo.aspect.MyAnnotation * com.example.demo.aspect..*.*(..))")
//    @Pointcut("@annotation(com.example.demo.aspect.MyAnnotation)")
    public void myPointcut() {
        logger.info("-----pointcut-----");
        System.out.println("------");
    }

    @Around("myPointcut() && @annotation(annotation)")
    public Object aspectProcessing(ProceedingJoinPoint proceedingJoinPoint,MyAnnotation annotation) {
        logger.info("---aspectProcessing---"+annotation.type());
        String type = annotation.type();
        Object arg = proceedingJoinPoint.getArgs()[0];
        Object arg1 = proceedingJoinPoint.getArgs()[1];
        logger.info("---type---" + type);
        logger.info("---i1---" + arg);
        logger.info("---i2---" + arg1);
        logger.info("do something");

        try {
            Object proceed = proceedingJoinPoint.proceed();
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;

    }
}