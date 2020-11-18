package com.example.demo.collection;

import org.junit.Test;

public class MyMap {
    /**
     * HashMap K,V都可为null
     * TreeMap K不可为null，value可以
     * ConcurrentHashMap K,V都不可为null
     */


    /**
     * 使用：在局部方法或者线程绝对安全的情况下使用
     */
    @Test
    public void testHashMap() {

    }

    /**
     * JDK1.8和之前区别
     * 1. 取消分段锁机制，进一步降低冲突概率;
     * 2. 引入红黑树（当链表>8 && table>= 64）
     * 3. 增加计算Map中元素数量的方法， mappingCount()
     */
    public void testConcurrentHashMap() {

    }

}
