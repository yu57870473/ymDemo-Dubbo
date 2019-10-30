package com.ym.controller;

import com.ym.entity.User;
import com.ym.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServiceImpl userService;
    @RequestMapping("/show")
    public List<User> show(){
        List<User> show = userService.show();
        return show;
    }
}
