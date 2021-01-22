package com.example.demo.spring;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MyTransaction {
    /**
     * 事务的目的：数据一致和操作隔离
     *      ---数据一致是指事务提交时保证事务内的所有操作都成功完成，并且更改永久生效；
     *          事务回滚时，保证能够恢复到事务执行之前的状态
     *      ---作隔离则是指多个同时执行的事务之间应该相互独立，互不影响
     * Spring
     *  采用AOP实现声明式事务，环绕通知
     *
     * 1、事务的特性
     *      · 原子性
     *      · 一致性
     *      · 隔离性
     *      · 持久性
     * 2、事务的配置方式class
     *      声明式事务管理
     *      编程式事务管理:spring推荐使用TransactionTemplate
     * 3、事务的传播行为
     *      · REQUIRED
     *          Spring默认的传播机制能满足绝大部分业务需求
     *          如果外层有事务，则当前事务加入到外层事务，一块提交，一块回滚。
     *          如果外层没有事务，新建一个事务执行
     *      · REQUIRES_NEW
     *
     *      · SUPPORTS
     *
     *      · NOT_SUPPORTED
     *
     *      · NEVER
     *
     *      · MANDATORY
     *
     *      · NESTED
     *
     *
     * 4、事务同时操作一个数据导致问题
     *      脏读：
     *          脏读发生在一个事务读取了被另一个事务改写但尚未提交的数据时。如果这些改变在
     *          稍后被回滚了，那么第一个事务读取的数据就会是无效的
     *      不可重复读：（修改数据）
     *          不可重复读发生在一个事务执行相同的查询两次或两次以上，但每次查询结果都不相同时。
     *          这通常是由于另一个并发事务在两次查询之间更新了数据。
     *      幻读：（新增或者删除）
     *          幻读和不可重复读相似。当一个事务（T1）读取几行记录后，另一个并发事务（T2）插入了一些记录时，
     *          幻读就发生了。在后来的查询中，第一个事务（T1）就会发现一些原来没有的额外记录。
     * 5、事务的隔离级别
     *      1、读未提交  ISOLATION_READ_UNCOMMITTED
     *          ---允许读取尚未提交的数据，可导致脏读、不可重复读、幻读
     *      2、读已提交  ISOLATION_READ_COMMITTED  （ORACLE默认级别）
     *          ---允许的读取已提交事务的数据，避免脏读，不能避免不可重复读、幻读
     *      3、可重复读  ISOLATION_REPEATABLE_READ （mysql默认级别）
     *          ---对相同字段数据多次读取结果一致，避免脏读，不可重复读，不能避免幻读
     *      4、串行化   ISOLATION_SERIALIZABLE
     *          ---完全遵循ACID原则，可避免脏读、不可重复读、幻读，通常锁表，效率低
     * 6、只读事务
     *      如果一个事务只对数据库执行读操作，那么该数据库就可能利用那个事务的只读特性，
     *      采取某些优化措施 readOnly = true
     * 7、事务超时
     *
     * 8、回滚规则
     *  出现 runtimeException时回滚
     *
     *
     *  https://www.cnblogs.com/mseddl/p/11577846.html
     *  https://zhuanlan.zhihu.com/p/54067384
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void execute() {

    }
}
