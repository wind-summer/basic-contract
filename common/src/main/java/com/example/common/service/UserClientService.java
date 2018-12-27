package com.example.common.service;

import com.example.common.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2018/12/26
 */
@FeignClient(value = "PRODUCER")
public interface UserClientService {

    @GetMapping("/system/user")
    public User getUser(@RequestParam String name);
}
