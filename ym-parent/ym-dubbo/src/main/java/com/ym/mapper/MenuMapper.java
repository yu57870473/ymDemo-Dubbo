package com.ym.mapper;

import com.ym.entity.Menu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper {
    @Select("select * from MENU")
    List<Menu> selAll();
    @Select("select * from MENU where pid=#{pid}")
    List<Menu> selByPid(String pid);
    @Select("select * from MENU where id=#{id}")
    Menu selById(String id);
}
