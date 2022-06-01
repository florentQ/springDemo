package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "data_model")
@Data
public class DataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SOME_DATA", length = 50)
    private String someData;
}
