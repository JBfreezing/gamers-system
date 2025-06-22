package com.itbin.gamerssystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gamers {
    private Integer gamesId;
    private String name;
    private String releaseDate;
    private String developer;
    private String publisher;
    private String description;
    private Integer stock;
    private Integer free;
    private  String createdAt;
    private String updateAt;
    private String consoleBrand;

}
