package com.itbin.gamerssystem.service.impl;

import com.itbin.gamerssystem.dto.Result;
import com.itbin.gamerssystem.entity.GameConsole;
import com.itbin.gamerssystem.mapper.GameConsoleMapper;
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
}
