package com.example.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2018/12/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
@AutoConfigureStubRunner(ids = {"com.example:producer:0.0.1-SNAPSHOT:stubs:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class ClassTest {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private MockMvc mvc;

    @Test
    public void test() throws Exception{
        //User user = restTemplate.getForObject("localhost:8001/user/1", User.class);
        //System.out.println(user.toString());

//        mvc.perform(MockMvcRequestBuilders.get("/c-user/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//                //.andExpect(MockMvcResultMatchers.jsonPath("code", Is.is("200")));

        mvc.perform(MockMvcRequestBuilders.get("/consumer/user3").param("name","张三"))
                .andExpect(MockMvcResultMatchers.status().isOk());
               // .andExpect(MockMvcResultMatchers.jsonPath("code", Is.is("200")));
        System.out.println("111111111");
    }

}
