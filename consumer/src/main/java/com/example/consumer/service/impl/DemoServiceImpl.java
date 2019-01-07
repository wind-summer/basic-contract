package com.example.consumer.service.impl;

import com.example.consumer.dao.DemoDao;
import com.example.consumer.pojo.Demo;
import com.example.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2019/1/7
 */
@Service
public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao;

    public DemoServiceImpl() {}

    public DemoServiceImpl(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    @Override
    public Demo insertDemo(Demo demo) {
        return demoDao.insertDemo(demo);
    }
    @Override
    public void deleteDemo(Demo demo) {
        demoDao.deleteDemo(demo);
    }
}
