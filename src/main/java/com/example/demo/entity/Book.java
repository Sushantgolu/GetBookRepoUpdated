package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String author;



}
