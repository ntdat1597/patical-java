package com.example.spring_crud_upload.model;

import com.example.spring_crud_upload.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername (String username);
}
