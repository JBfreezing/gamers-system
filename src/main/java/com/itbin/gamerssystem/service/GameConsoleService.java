package com.itbin.gamerssystem.service;


import com.itbin.gamerssystem.dto.ConsolePageQueryDTO;
import com.itbin.gamerssystem.entity.GameConsole;
import com.itbin.gamerssystem.result.PageResult;

public interface GameConsoleService {

    GameConsole getById(Integer id);

    PageResult getConsole(ConsolePageQueryDTO consolePageQueryDTO);
}
