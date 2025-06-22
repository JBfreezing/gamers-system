package com.itbin.gamerssystem.service;

import com.itbin.gamerssystem.entity.GamePageDTO;
import com.itbin.gamerssystem.result.PageResult;

public interface GameService {

    //分页查询游戏
    PageResult page(GamePageDTO pageDTO);
}
