package com.example.demo.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AspectMgrImpl {

    Logger logger = LoggerFactory.getLogger(getClass());

    @MyAnnotation(type = "girl")
    public void proxy(Integer i1, Integer i2) {
        logger.info("--proxy--");
    }
}
