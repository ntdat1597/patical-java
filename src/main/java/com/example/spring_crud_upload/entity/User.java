package com.example.spring_crud_upload.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

}
