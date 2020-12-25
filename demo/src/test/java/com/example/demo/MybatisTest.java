package com.example.demo;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMPMapper;
import com.example.demo.mapper.UserMybatisMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
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
    public void testUpdateSet() {
       userMybatisMapper.updateBySet(1,33,null);
    }

    @Test
    public void testForeach() {
        List<User> users = userMybatisMapper.selectByForeach(Arrays.asList(1L, 2L, 3L));
        logger.info("size:{}", users.size());
    }

    @Test
    public void testPageHelper() {
        PageHelper.startPage(1, 2);
        List<User> users = userMapper.selectList(null);
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        List<User> list = userPageInfo.getList();
        logger.info("---------size:{}", list);

    }

    @Test
    public void testsSelect() {
        logger.info("---start -------");


        List<User> users = userMapper.selectList(null);
        logger.info(users.size() + "");
        logger.info("----------");
        List<User> users1 = userMybatisMapper.selectByIf(3);
        logger.info(users1.size() + "");
        logger.info("----------");
        List<User> when1 = userMybatisMapper.selectByWhen("Jack", 3);
        logger.info(when1.size() + "");
        logger.info("----------");
        List<User> when2 = userMybatisMapper.selectByWhen(null, 3);
        logger.info(when2.size() + "");
        logger.info("----------");
        List<User> where1 = userMybatisMapper.selectByWhere(3, 18);
        logger.info(where1.size() + "");
        logger.info("----------");
        List<User> where2 = userMybatisMapper.selectByWhere(null, 18);
        logger.info(where2.size() + "");
        logger.info("----------");
        List<User> where3 = userMybatisMapper.selectByWhere(3, null);
        logger.info(where3.size() + "");
        logger.info("----------");
    }


}
