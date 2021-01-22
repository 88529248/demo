package com.example.demo.mysql;

import org.springframework.stereotype.Service;

@Service
public class SqlKeyWord {


    /**
     * select
     *
     * as
     *
     * distinct
     *
     * +
     *      1.两个数字直接相加
     *      2.一个数字一个字符，会尝试将字符转化为数字，
     *          失败则将其转化为0
     *      3.其中一个为null的话结果一定为null
     * CONCAT（拼接）
     *      select CONCAT（a,b,c） AS "结果";
     * where
     *      1.条件表达式（< > <>不等于 <= >=）
     *      2.逻辑运算符（and or not）
     *      3.模糊查询（like between...and in   is null <=>安全等于）
     *      is null仅可判断null值， <=>可以判断null和数值
     *      like _ 一个字符  %  通配符  ESCAPE 设置通配符
     *
     * 基础函数：
     *  UPPER,LOWER,SUBSTR,TRIM,RPAD,REPLACE,
     *  INSTR:返回字符串第一次出现的索引
     *
     * 数学函数：
     *  round：四舍五入
     *  CEIL：向上取整，返回大于等于该参数的最小整数
     *  FLOOR：向下取整
     *  TRUNCATE：截断（1.34,1） --> 1.3  小数点后保留几位
     *  MOD（10,3） -->取模
     *
     *  日期函数：
     *  NOW :返回当前系统时间
     *  CURDATE：当前日期
     *  CURTIME：当前时间
     *  str_to_date：将日志格式的字符转化为指定格式的日期
     *  date_format：将日期转化为字符
     *
     *  流程控制函数：
     *  if(boolean,case1,case2)
     *  case
     *
     */

    /**
     * 分组函数：
     *  SUM
     *  AVG
     *  MIN
     *  MAX
     *  COUNT
     */

}
