package com.itbin.gamerssystem.mapper;

import com.github.pagehelper.Page;
import com.itbin.gamerssystem.entity.GamePageDTO;
import com.itbin.gamerssystem.entity.Gamers;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GameMapper {

    //分页查询游戏
    Page<Gamers> page(GamePageDTO pageDTO);
}
