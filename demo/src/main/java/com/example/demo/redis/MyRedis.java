//package com.example.demo.redis;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.data.redis.connection.RedisConnection;
//import org.springframework.data.redis.core.RedisCallback;
//import org.springframework.data.redis.core.RedisTemplate;
//import redis.clients.jedis.JedisCommands;
//
//public class MyRedis {
//
//
//    @Autowired
//    RedisTemplate redisTemplate;
//
//    //分布式 原子 保证某次任务多实例只有一个执行
//    private String lock() {
//
//        String lockKey = "lockKey";
//        redisTemplate.execute(new RedisCallback<String>() {
//            @Override
//            public String doInRedis(RedisConnection redisConnection) throws DataAccessException {
//                JedisCommands jedisCommands = (JedisCommands) redisConnection.getNativeConnection();
//                return jedisCommands.set(lockKey, "1", "NX", "EX", 600);
//            }
//        });
//        redisTemplate.execute((RedisConnection redisConnection) -> {
//            JedisCommands jedisCommands = (JedisCommands) redisConnection.getNativeConnection();
//            return jedisCommands.set(lockKey, "3", "NX", "EX", 600);
//        });
//        return null;
//
//
//    }
//
//
//
//}
