package com.example.spring_crud_upload.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProductValidator implements Validator {


    @Override
    public boolean supports (Class<?> clazz) {
        return Product.class.equals(clazz);
    }

    @Override
    public void validate (Object o, Errors errors) {
        Product st = (Product) o;
        if ( st.getName().equals("tiendat") ) {
            errors.rejectValue("name", null, "Chào Tiến Đạt Bạn Quá Đz Luôn :))");
        }
    }
}
