package com.example.demo.sync;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.StampedLock;

public class MyStampedLock {
    /**
     * ReentrantReadWriteLock
     */

    static ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
            10, 5, TimeUnit.MINUTES,
            new LinkedBlockingDeque<>(1), new ThreadPoolExecutor.CallerRunsPolicy());

    static StampedLock stampedLock = new StampedLock();

    private Integer i = 0, j = 0;


    @Test
    public void test() {
        writeAction();
        readAction();
        readAction1();

    }

    void writeAction() {
        long l = stampedLock.writeLock();
        executor.execute(() -> {
            try {
                System.out.println("执行写操作" + LocalDateTime.now());
                ++i;
                ++j;
                System.out.println("执行写操作后：i =" + i + ".j=" + j);
                TimeUnit.SECONDS.sleep(5L);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                stampedLock.unlockWrite(l);
            }
        });
    }

    void readAction() {
        long l = stampedLock.readLock();
        executor.execute(() -> {
            try {
                System.out.println("执行读操作i=" + i + " j:" + j + " time:" + LocalDateTime.now());
            } finally {
                stampedLock.unlockRead(l);
            }
        });
    }

    void readAction1() {
        long l = stampedLock.readLock();
        executor.execute(() -> {
            try {
                System.out.println("执行读111操作i=" + i + " j:" + j + " time:" + LocalDateTime.now());
            } finally {
                stampedLock.unlockRead(l);
            }
        });
    }

    void optimisticRead() {
        long l = stampedLock.tryOptimisticRead();//尝试获取乐观读锁
        //检查在获取到锁后，有没有被其他线程抢占
        if (!stampedLock.validate(l)) {
//            如果被抢占了则获取一个共享读锁（悲观）
            l = stampedLock.readLock();
            try {
                System.out.println(123);
            } finally {
                stampedLock.unlockRead(l);
            }

        }
    }


}
