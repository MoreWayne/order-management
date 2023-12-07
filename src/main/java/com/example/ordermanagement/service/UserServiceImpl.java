package com.example.ordermanagement.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final static Map<String, String> map = new HashMap<>();

    static {
        map.put("330100", "杭州市");
        map.put("330101", "上城区");
        map.put("330102", "西湖区");
    }


}
