package com.example.reflectiontest.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseDto {

    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
