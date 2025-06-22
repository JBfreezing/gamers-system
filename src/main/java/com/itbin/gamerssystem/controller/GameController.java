package com.itbin.gamerssystem.controller;

import com.itbin.gamerssystem.dto.Result;
import com.itbin.gamerssystem.entity.GamePageDTO;
import com.itbin.gamerssystem.result.PageResult;
import com.itbin.gamerssystem.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/game")
@Slf4j
public class GameController {

    @Autowired
    private GameService gameService;

    //分页查询游戏
    @GetMapping("/page")
    public Object page(GamePageDTO pageDTO){
        PageResult pageResult = gameService.page(pageDTO);
        return Result.success(pageResult);
    }
}
