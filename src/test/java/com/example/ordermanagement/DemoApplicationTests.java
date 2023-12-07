package com.example.ordermanagement;

import com.example.ordermanagement.domain.User;
import com.example.ordermanagement.domain.mapper.OrderMapper;
import com.example.ordermanagement.domain.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }


}
