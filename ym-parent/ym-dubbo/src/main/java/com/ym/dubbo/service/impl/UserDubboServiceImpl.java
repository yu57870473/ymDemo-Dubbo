package com.ym.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ym.dubbo.service.UserDubboService;
import com.ym.entity.User;
import com.ym.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;
@Service
@org.springframework.stereotype.Service
public class UserDubboServiceImpl implements UserDubboService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selAll() {
        return userMapper.selAll();
    }
}
