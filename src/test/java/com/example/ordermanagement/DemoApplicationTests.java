package com.example.ordermanagement;

import com.example.ordermanagement.domain.OrderDO;
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
        List<OrderDO> users = orderMapper.selectList(null);
        users.forEach(System.out::println);
    }


}
