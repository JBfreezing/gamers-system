package com.itbin.gamerssystem.controller;

import com.itbin.gamerssystem.dto.ConsolePageQueryDTO;
import com.itbin.gamerssystem.dto.Result;
import com.itbin.gamerssystem.entity.GameConsole;
import com.itbin.gamerssystem.result.PageResult;
import com.itbin.gamerssystem.service.GameConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/console")
public class GameConsoleController {

    @Autowired
    private GameConsoleService gameConsoleService;
    @GetMapping("/{id}")
    public Result<GameConsole> getById(@PathVariable Integer id){
        GameConsole gameConsole = gameConsoleService.getById(id);
        return Result.success(gameConsole);
    }

    /**
     *分页查询主机
     */
    @GetMapping("/page")
    public Result<PageResult> getConsole(ConsolePageQueryDTO consolePageQueryDTO){
        PageResult pageResult = gameConsoleService.getConsole(consolePageQueryDTO);
        return Result.success(pageResult);
    }

}
