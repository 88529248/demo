package com.example.demo.concurrencythread;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.time.LocalDateTime;
import java.util.concurrent.*;

@Configuration
public class MyExecutor {

    @Bean
    public Executor executor() {

        /**
         * Runtime.getRuntime().availableProcessors()
         */
        ExecutorService workStealingPool = Executors.newWorkStealingPool();

        /**
         * Runtime.getRuntime().availableProcessors()
         */
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        /**
         * Runtime.getRuntime().availableProcessors()
         */
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);

        /**
         * Runtime.getRuntime().availableProcessors()
         */
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
                5, 5, TimeUnit.MINUTES,
                new LinkedBlockingDeque<>(10),
                new ThreadPoolExecutor.CallerRunsPolicy());
        return threadPoolExecutor;
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(Runtime.getRuntime().availableProcessors());
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
        scheduledThreadPool.schedule(() -> {
            System.out.println("task1" + LocalDateTime.now());
        }, 3, TimeUnit.SECONDS);
        scheduledThreadPool.schedule(() ->
                        System.out.println("task2" + LocalDateTime.now())
                , 2, TimeUnit.SECONDS);
        scheduledThreadPool.scheduleAtFixedRate(() ->
                System.out.println("task3" + LocalDateTime.now()), 10, 2, TimeUnit.SECONDS);
        System.out.println(LocalDateTime.now());
    }
    /*
     * ThreadPoolExecutor  execute()源码
     * Proceed in 3 steps:
     *
     * 1. If fewer than corePoolSize threads are running, try to
     * start a new thread with the given command as its first
     * task.  The call to addWorker atomically checks runState and
     * workerCount, and so prevents false alarms that would add
     * threads when it shouldn't, by returning false.
     *
     * 2. If a task can be successfully queued, then we still need
     * to double-check whether we should have added a thread
     * (because existing ones died since last checking) or that
     * the pool shut down since entry into this method. So we
     * recheck state and if necessary roll back the enqueuing if
     * stopped, or start a new thread if there are none.
     *
     * 3. If we cannot queue task, then we try to add a new
     * thread.  If it fails, we know we are shut down or saturated
     * and so reject the task.
     */
    /**
     * 1.获取
     */

//    int c = ctl.get();
//        if (workerCountOf(c) < corePoolSize) {
//        if (addWorker(command, true))
//            return;
//        c = ctl.get();
//    }
//        if (isRunning(c) && workQueue.offer(command)) {
//        int recheck = ctl.get();
//        if (! isRunning(recheck) && remove(command))
//            reject(command);
//        else if (workerCountOf(recheck) == 0)
//            addWorker(null, false);
//    }
//        else if (!addWorker(command, false))
//    reject(command);


}
