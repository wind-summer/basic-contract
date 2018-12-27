package com.example.consumer.controller;

import com.example.common.entity.User;
import com.example.common.service.UserClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2018/12/26
 */
@RestController
@AllArgsConstructor
public class UserController {

    private UserClientService userClientService;

    private RestTemplate restTemplate;

    @GetMapping("/consumer/user1")
    public User getUser1(@RequestParam String name){
        return userClientService.getUser(name);
    }

    @GetMapping("/consumer/user2")
    public User getUser2(@RequestParam String name){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "王五");






        return restTemplate.getForObject("http://localhost:8001/system/user?name="+name,User.class);
    }

    @GetMapping("/consumer/user3")
    public User getUser3(@RequestParam String name){
        return restTemplate.getForObject("http://localhost:8080/system/user",User.class, name);
    }
}
