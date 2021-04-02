package com.example.spring_crud_upload.entity;

import lombok.Data;

@Data
public class CustomErrorType {

    private String errorMessage;

    public CustomErrorType (String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
