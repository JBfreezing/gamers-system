package com.itbin.gamerssystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameConsole {
    private Integer id;
    private String consoleId;
    private String brand;
}
