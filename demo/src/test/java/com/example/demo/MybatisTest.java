package com.example.demo;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMPMapper;
import com.example.demo.mapper.UserMybatisMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private UserMPMapper userMapper;

    @Resource
    private UserMybatisMapper userMybatisMapper;

    @Test
    public void testsSelect(){
        logger.info("---start -------");
        List<User> users = userMapper.selectList(null);
        logger.info(users.size()+"");
        List<User> users1 = userMybatisMapper.selectAll();
        logger.info(users1.size()+"");

    }


}
