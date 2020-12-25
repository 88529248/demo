package com.example.demo.mapper;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMybatisMapper {

    @Select("SELECT * FROM user")
    List<User> selectAll();

}
