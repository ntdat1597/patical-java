package com.example.spring_crud_upload.model;

import com.example.spring_crud_upload.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
