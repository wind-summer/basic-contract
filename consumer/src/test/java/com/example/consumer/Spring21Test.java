package com.example.consumer;

import com.example.consumer.dao.DemoDao;
import com.example.consumer.pojo.Demo;
import com.example.consumer.service.DemoService;
import com.example.consumer.service.impl.DemoServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2019/1/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class Spring21Test {

    @Autowired
    private DemoService demoService;

    @Test
    public void test1(){
        // pojo对象
        Demo demo = new Demo();
        demo.setId("123");
        demo.setName("Jay");
        demo.setAge(100);

        // mock一个userDao对象,本来是不存在的
        DemoDao demoDao = Mockito.mock(DemoDao.class);
        Mockito.when(demoDao.insertDemo(demo)).thenReturn(demo);
        Demo d = demoDao.insertDemo(demo);

        // 这里模拟Spring给userService注入userDao
        demoService = new DemoServiceImpl(demoDao);
        Demo us = demoService.insertDemo(demo);

        Assert.assertEquals(us, demo);// 测试结果ok

        /**
         *  在开发中有接口UserDao但是没有实现，因此UserService里面的userDao属性也是没有实现的，
         *  模拟Spring给UserService里面的userDao注入一个实现，实际上没有注入，而仅仅是mock了一个userDao
         *  在userService调用insertUser(User user)方法的时候就能模拟实现
         *  当然这里仅仅mock了方法调用返回，还有mock异常，验证调用次数等
         *  从整个来讲，这个框架是十分简单易用功能强大的，这里的简单是指使用简单，框架本身是相当复杂的
         */


    }
}
