package com.itbin.gamerssystem.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itbin.gamerssystem.dto.ConsolePageQueryDTO;
import com.itbin.gamerssystem.dto.Result;
import com.itbin.gamerssystem.entity.GameConsole;
import com.itbin.gamerssystem.mapper.GameConsoleMapper;
import com.itbin.gamerssystem.result.PageResult;
import com.itbin.gamerssystem.service.GameConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameConsoleServiceImpl implements GameConsoleService {

    @Autowired
    private GameConsoleMapper gameConsoleMapper;

    @Override
    public GameConsole getById(Integer id) {
        GameConsole gameConsole = gameConsoleMapper.getById(id);
        return gameConsole;
    }

    /**
     * 分页查询主机
     * @param consolePageQueryDTO
     * @return
     */
    @Override
    public PageResult getConsole(ConsolePageQueryDTO consolePageQueryDTO) {
        PageHelper.startPage(consolePageQueryDTO.getPageNum(),consolePageQueryDTO.getPageSize());
        Page<GameConsole> page = gameConsoleMapper.getConsole(consolePageQueryDTO);
        return new PageResult(page.getTotal(),page.getResult());
    }

}
