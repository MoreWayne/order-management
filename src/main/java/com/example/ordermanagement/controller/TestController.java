package com.example.ordermanagement.controller;


import com.example.ordermanagement.domain.User;
import com.example.ordermanagement.domain.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String sayHi() {

        List<User> users = userMapper.selectList(null);
        List<String> collect = users.stream().map(User::getUserName).toList();
        return collect.toString();
    }
}
