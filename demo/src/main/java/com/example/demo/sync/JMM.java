package com.example.demo.sync;

public class JMM {
    /**
     * java memory model
     * 线程之间的共享变量存储在主内存（Main Memory）中，
     * 每个线程都有一个私有的本地内存（Local Memory），
     * 本地内存中存储了该线程以读/写共享变量的副本。
     * 本地内存是JMM的一个抽象概念，并不真实存在。
     * 它涵盖了缓存、写缓冲区、寄存器以及其他的硬件和编译器优化。
     * 1.原子性：
     * 2.有序性:
     * 3.可见性:
     *
     * as if serial(像是连续的)
     *
     * happen before
     *
     * volatile
     *
     * synchronized
     *
     * ABA
     */


}
