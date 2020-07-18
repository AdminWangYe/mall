package com.uestc.mall.service;

public interface RedisService {
    /**
     * 存储数据
     * @param key
     * @param value
     */
    void set(String key,String value);

    /**
     * 获得数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key,long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param key key
     * @param delta 自增步长
     * @return
     */
    Long increment(String key,long delta);
}
