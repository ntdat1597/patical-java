package com.example.spring_crud_upload.service;


import com.example.spring_crud_upload.entity.User;
import com.example.spring_crud_upload.model.RoleRepository;
import com.example.spring_crud_upload.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void save (User user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    user.setRoles(new HashSet<>(roleRepository.findAll()));
    userRepository.save(user);

    }

    @Override
    public User findByUsername (String username) {
        return userRepository.findByUsername(username);
    }
}
