package com.ym.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ym.dubbo.service.MenuDubboService;
import com.ym.entity.Menu;
import com.ym.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Reference
    private MenuDubboService menuDubboService;


    @Override
    public List<Menu> show() {
        return menuDubboService.selAll();
    }
}
