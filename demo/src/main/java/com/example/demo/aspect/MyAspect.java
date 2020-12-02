package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {

    Logger logger = LoggerFactory.getLogger(getClass());

//    @Pointcut("execution(@com.example.demo.aspect.MyAnnotation * com.example.demo.aspect..*.*(..))")
    @Pointcut("@annotation(com.example.demo.aspect.MyAnnotation)")
    private void pointcut() {
        logger.info("-----pointcut-----");
    }

    @Around(value="pointcut()")
    private void aspectProcessing(ProceedingJoinPoint proceedingJoinPoint) {
//        String type = myAnnotation.type();
        Object arg = proceedingJoinPoint.getArgs()[0];
        Object arg1 = proceedingJoinPoint.getArgs()[1];
        logger.info("---aspectProcessing---");
//        logger.info("---type---" + type);
        logger.info("---i1---" + arg);
        logger.info("---i2---" + arg1);


        try {
            Object proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }


}
