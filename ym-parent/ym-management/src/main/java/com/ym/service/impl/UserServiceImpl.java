package com.ym.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ym.dubbo.service.UserDubboService;
import com.ym.entity.User;
import com.ym.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Reference
    private UserDubboService userDubboService;
    @Override
    public List<User> show() {
        return userDubboService.selAll();
    }
}
