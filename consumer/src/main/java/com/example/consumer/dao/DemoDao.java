package com.example.consumer.dao;

import com.example.consumer.pojo.Demo;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2019/1/7
 */
public interface DemoDao {

    Demo insertDemo(Demo user);

    void deleteDemo(Demo user);
}
