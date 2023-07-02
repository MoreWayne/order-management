package com.example.ordermanagement.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.ordermanagement.domain.ClientDO;
import com.example.ordermanagement.domain.mapper.ClientMapper;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, ClientDO> implements ClientService {

}
