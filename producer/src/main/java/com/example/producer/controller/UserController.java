package com.example.producer.controller;

import com.example.common.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2018/12/26
 */
@RestController
public class UserController {

    @GetMapping("/system/user")
    public User getUser(@RequestParam String name){
        User user = new User().setId(1L).setAge(15).setName(name).setSex("男").setRemark(".....");
        return user;
    }

    @GetMapping("/system/user2")
    public User getUser2(@RequestParam String name){
        User user = new User().setId(1L).setAge(15).setName(name).setSex("女").setRemark(".....");
        return user;
    }
}
