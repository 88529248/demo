package com.example.demo.concurrencythread;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class AQS extends AbstractQueuedSynchronizer {

    /**
     *
     */

    ReentrantLock reentrantLock = new ReentrantLock();

    AtomicReference atomicReference = new AtomicReference();

}
