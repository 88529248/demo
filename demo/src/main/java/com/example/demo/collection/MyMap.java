package com.example.demo.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MyMap {
    /**
     * HashMap K,V都可为null
     * TreeMap K不可为null，value可以
     * ConcurrentHashMap K,V都不可为null
     * 小总结：只有HashMap key可以为空，HashMap,TreeMap value可以为空
     */

    /**
     * 树：
     * 二叉树：
     * 平衡二叉树：
     * 二叉查找树：
     * 红黑树：
     *
     */


    /**
     * 使用：在局部方法或者线程绝对安全的情况下使用
     */
    @Test
    public void testHashMap() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(1, 1);
    }

    /**
     * JDK1.8和之前区别
     * 1. 取消分段锁机制，大量使用无锁技术，进一步降低冲突概率;
     * 2. 引入红黑树（当链表>8 && table>= 64），size<6时重新转为链表
     * 3. 增加计算Map中元素数量的方法， mappingCount()
     */
    public void testConcurrentHashMap() {
        ConcurrentHashMap map = new ConcurrentHashMap<Integer, Integer>();
        map.get("");
    }

}
