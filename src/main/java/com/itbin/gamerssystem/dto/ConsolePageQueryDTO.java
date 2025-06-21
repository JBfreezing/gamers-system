package com.itbin.gamerssystem.dto;

import lombok.Data;

@Data
public class ConsolePageQueryDTO {
    private String brand;
    private Integer pageNum;
    private Integer pageSize;
    private String direction;
    private Boolean status;
}
