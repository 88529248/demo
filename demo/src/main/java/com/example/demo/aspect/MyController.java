package com.example.demo.aspect;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo",produces = {"application/json"})
public class MyController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    AspectMgrImpl aspectMgr;

//    @MyAnnotation(type = "boy")
    @GetMapping("/test")
    public void test() {
        aspectMgr.proxy(1,2);
    }


}
