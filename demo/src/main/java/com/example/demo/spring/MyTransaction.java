package com.example.demo.spring;

import org.springframework.transaction.annotation.Transactional;

public class MyTransaction {
    /**
     * Spring
     *  采用AOP实现声明式事务，环绕通知
     *
     * 1、事务的特性
     *      原子性
     *      一致性
     *      隔离性
     *      持久性
     * 2、事务的配置方式class
     *      声明式事务管理
     *      编程式事务管理:spring推荐使用TransactionTemplate
     * 3、事务的传播行为
     *
     *
     * 4、事务同时操作一个数据导致问题
     *      脏读：
     *      不可重复读：
     *      幻读：
     * 5、事务的隔离级别
     *
     *
     * 6、只读事务
     *
     * 7、事务超时
     *
     * 8、回滚规则
     *
     */
    @Transactional()
    public void execute() {

    }
}
