package com.example.demo.tip;

public class MyThreadLocal {


    void test() {

        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        threadLocal.get();
    }

}
