package com.example.basic_jwt_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.basic_jwt_app.model.User;

@Service
public class UserServices {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        
        users.add(new User(UUID.randomUUID().toString(), "Abhishek", "pass1", "a@dev.in"));
        users.add(new User(UUID.randomUUID().toString(), "Vivek", "pass2", "b@dev.in"));
        users.add(new User(UUID.randomUUID().toString(), "Mohit", "pass3", "c@dev.in"));

        return users;
    }
}
