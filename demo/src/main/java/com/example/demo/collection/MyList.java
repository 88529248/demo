package com.example.demo.collection;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MyList {
// array ArrayList LinkList

    /**
     * 数组
     * 初始化：String[] s = {1,2}; String s1 = new String[2];
     * 数组初始化后长度不可变
     * 扩容：初始容量为10，每次add之前判断能否放下size+1个元素，否则调grow方法扩容
     * newCapaticy = oldCapaticy + (oldCapaticy >> 1)，之后判断newCapacity 是否
     * 大于目标值，小于Integer最大值
     * 排序：TimSort：优化了归并排序和插入排序
     */


    void arrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
    }

    /**
     * 底层是双向链表 插入和删除快
     */

    void linkedList() {

        LinkedList<Object> linkedList = new LinkedList<>();

    }


}
