package com.ym.controller;

import com.ym.entity.Menu;
import com.ym.service.impl.MenuServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/menu")
public class MenuController {
    @Resource
    private MenuServiceImpl menuService;
    @RequestMapping("/show")
    public List<Menu> show(){
        List<Menu> show = menuService.show();
        return show;
    }
}
