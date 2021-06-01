package com.homework.ninthhomeworklistener.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class Request implements Serializable {
    @NotBlank
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String phoneNumber;
}