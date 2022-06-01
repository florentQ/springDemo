package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class DataModelDTO {

    private Long id;

    @Size(max = 50)
    private String someData;
}
