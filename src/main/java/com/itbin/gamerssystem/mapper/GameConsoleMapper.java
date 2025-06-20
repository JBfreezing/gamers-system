package com.itbin.gamerssystem.mapper;

import com.itbin.gamerssystem.entity.GameConsole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GameConsoleMapper {

    @Select("select * from gamers_console where id=#{id}")
    GameConsole getById(Integer id);
}
