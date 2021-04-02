package com.example.spring_crud_upload.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @NotBlank(message = "Tên không được để chống")
    @Size(min = 8, message = "Tên phải dài hơn 8 kí tự")

    private String name;
    private String imgUrl;
    @Min(1)
    private int price;

    private long createdTime;

    private int status;

    public Product () {

    }

    public Product(@NotNull @Size(min = 8) String name, String imgUrl, @Min(1) int price) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
        this.createdTime = System.currentTimeMillis();
        this.status = 1;
    }
}
