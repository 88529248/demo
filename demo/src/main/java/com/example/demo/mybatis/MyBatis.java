package com.example.demo.mybatis;


import com.example.demo.mapper.UserMPMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBatis {

    @Autowired
    UserMPMapper userMapper;

    void findAll() {
        userMapper.selectList(null);
    }

}
