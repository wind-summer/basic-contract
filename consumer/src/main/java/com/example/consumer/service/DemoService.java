package com.example.consumer.service;

import com.example.consumer.pojo.Demo;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2019/1/7
 */
public interface DemoService {

    Demo insertDemo(Demo demo);

    void deleteDemo(Demo demo);
}
