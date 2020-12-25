package com.example.demo.mapper;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMybatisMapper {

    /**
     * 动态SQL
     * 1.if
     * 2.choose(when,otherwise)
     * 3.trim(where,set)
     * 4.foreach
     */

    // if id如果不为空，筛选条件加上id
    @Select("<script>"
            + "SELECT * FROM user WHERE age > 20"
            + "  <if test= 'id != null'> AND id > #{id} </if>"
            + "</script>")
    List<User> selectByIf(@Param("id") Integer id);

    //when 类似于switch case


    @Select("<script>"
            + "SELECT * FROM user WHERE id &gt; 1"
            + "<choose>"
            + "<when test='name != null'>"
            + "AND name like #{name}"
            + "</when>"
            + "<when test='age != null'>"
            + "AND age > #{age}"
            + "</when>"
            + "<otherwise>"
            + "AND featured = 1"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<User> selectByWhen(@Param("name") String name, @Param("age") Integer age);


    @Select("<script>"
            + "SELECT * FROM user"
            + "  <where>"
            + "    <if test='id != null'>"
            + "         id = #{id}"
            + "    </if>"
            + "    <if test='age != null'>"
            + "        AND age = #{age}"
            + "    </if>"
            + "  </where>"
            + "</script>")
    List<User> selectByWhere(@Param("id") Integer id, @Param("age") Integer age);

    @Select("<script>"
            + "SELECT * FROM user WHERE id in "
            + "<foreach item='item' index='index' collection='ids' "
            + "open='(' separator=',' close=')' >"
            + "#{item}"
            + "</foreach>"
            + "</script>")
    List<User> selectByForeach(@Param("ids") List<Long> ids);


    @Update("<script>"
            + "update user"
            + "<set>"
            + "<if test='age!=null'>age=#{age},</if>"
            + "<if test='email!=null'>email=#{email},</if>"
            + "</set>"
            + "where id=#{id}"
            + "</script>")
    void updateBySet(@Param("id") Integer id, @Param("age") Integer age, @Param("email") Integer email);

}
