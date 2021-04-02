package com.example.spring_crud_upload.service;

public interface SecurityService {
    String findLoggedInUsername ();

    void autoLogin (String username, String password);
}
