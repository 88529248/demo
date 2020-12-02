package com.example.demo.stream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {
    Logger logger = LoggerFactory.getLogger(getClass());
    static List<User> list = new ArrayList<User>();

    static {
        for (int i = 0; i < 5; i++) {
            list.add(new User("name" + i, i, i > 2 ? "girl" : "boy", new ArrayList<Integer>(Integer.valueOf(i))));
        }

    }

    @Test
    public void test() {

        //Stream流生成方式
        Stream<Integer> s11 = Stream.of(1, 2, 3, 4);
        Stream<Double> s22 = Stream.generate(Math::random).limit(2);
        Stream<Integer> s33 = Stream.iterate(0, (s) -> s + 2).limit(3);

        //是否有年龄大于2的人
        boolean b = list.stream().anyMatch(x -> x.getAge() > 2);
        //取年龄最大的人
        User user = list.stream().max((s1, s2) -> s1.getAge() - s2.getAge()).get();
        //所有人age生成list
        List<Integer> ageList = list.stream().collect(Collectors.mapping(User::getAge, Collectors.toList()));
        //所有人年龄相加
        Integer ageSum = list.stream().collect(Collectors.summingInt(User::getAge));
        //根据性别分组生成map
        Map<String, List<User>> userMap = list.stream().collect(Collectors.groupingBy(User::getSex));
        //将所有score生成一个list
        List<Integer> collect = list.stream().collect(Collectors.mapping(User::getScore, Collectors.toList())).
                stream().flatMap(List::stream).collect(Collectors.toList());
        //先按名字倒叙排、再按性别正序排
        Stream<User> sortedUser = list.stream().sorted(Comparator.comparing(User::getName).reversed().
                thenComparing(User::getSex));
        //对某个int，double类型元素取最大值、最小值、平均值操作
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(User::getAge).summaryStatistics();
        intSummaryStatistics.getMax();
        //将所有人名字以","拼接为一个字符串
        String joinStr = list.stream().map(User::getName).collect(Collectors.joining(","));
        logger.info(joinStr);

    }


}
