package com.example.demo.aspect;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo",produces = {"application/json"})
public class MyProcess {
    Logger logger = LoggerFactory.getLogger(getClass());



    @GetMapping("/test")
    public void test() {
        logger.info("-----");
        proxy(1,2);
    }
    @MyAnnotation(type = "sta")
    void proxy(Integer i1, Integer i2) {

    }

}
