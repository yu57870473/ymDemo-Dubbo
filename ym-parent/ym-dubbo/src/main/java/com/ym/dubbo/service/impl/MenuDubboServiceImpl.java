package com.ym.dubbo.service.impl;

import com.ym.mapper.MenuMapper;
import com.ym.dubbo.service.MenuDubboService;
import com.ym.entity.Menu;

import javax.annotation.Resource;
import java.util.List;

public class MenuDubboServiceImpl implements MenuDubboService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> selAll() {
        List<Menu> menus = menuMapper.selAll();
        for (Menu menu: menus) {
            if(menu.getPid()!=null) {
                menu.setParent(menuMapper.selById(menu.getPid()));
            }
                menu.setChildren(menuMapper.selByPid(menu.getId()));
        }
        return menus;
    }
}
