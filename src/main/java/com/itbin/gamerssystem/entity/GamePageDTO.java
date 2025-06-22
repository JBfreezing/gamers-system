package com.itbin.gamerssystem.entity;

import lombok.Data;

@Data
public class GamePageDTO {
    private String name;
    private Integer pageNum;
    private Integer pageSize;
    private String direction;
}
