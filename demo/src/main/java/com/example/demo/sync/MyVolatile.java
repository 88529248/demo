package com.example.demo.sync;

public class MyVolatile {

    /**
     * 保证可见性、禁止指令重排
     */


    /**
     * 加volatile是为了保证多线程环境实例能够正常创建
     * 多线程有可能执行顺序为132
     * 1.memory = allocate() 开辟内存
     * 2.createInstance(memory)  创建实例
     * 3.singleton = memory   引用赋值给singleton
     */
    private static volatile Singleton singleton;

    public Singleton getSingleton() {
        if (singleton == null) {
            synchronized (this) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    static class Singleton {
        Integer id;
    }

}
