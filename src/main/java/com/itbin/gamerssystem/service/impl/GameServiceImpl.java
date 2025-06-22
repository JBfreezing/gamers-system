package com.itbin.gamerssystem.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itbin.gamerssystem.entity.GamePageDTO;
import com.itbin.gamerssystem.entity.Gamers;
import com.itbin.gamerssystem.mapper.GameMapper;
import com.itbin.gamerssystem.result.PageResult;
import com.itbin.gamerssystem.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    //分页查询游戏
    @Override
    public PageResult page(GamePageDTO pageDTO) {
        PageHelper.startPage(pageDTO.getPageNum(), pageDTO.getPageSize());
        Page<Gamers> page = gameMapper.page(pageDTO);

        return new PageResult(page.getTotal(), page.getResult());
    }
}
