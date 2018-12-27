package com.example.producer;

import com.example.producer.controller.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2018/12/21
 */
public class MvcMockTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new UserController());
    }
}
