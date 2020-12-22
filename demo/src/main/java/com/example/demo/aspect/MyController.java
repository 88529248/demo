package com.example.demo.aspect;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试接口类",tags = "测试接口")   //http://localhost/swagger-ui.html
@RequestMapping(path = "/demo", produces = {"application/json"})
public class MyController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${PROPERTIES_VALUE:666}")
    private int value;

    @Autowired
    public MyController(AspectMgrImpl aspectMgr) {
        this.aspectMgr = aspectMgr;
    }

    //Field injection is not recommended  不推荐属性注入
//    @Autowired
    AspectMgrImpl aspectMgr;

    @MyAnnotation(type = "boy")
    @ApiOperation(value = "测试方法",notes = "notes")
    @ApiImplicitParam(name = "id",value = "用户Id",required = true,dataType = "long")
    @GetMapping("/test")
    public void test() {
        aspectMgr.proxy(1, 2);
    }


}
