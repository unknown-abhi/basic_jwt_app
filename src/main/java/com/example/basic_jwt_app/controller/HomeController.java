package com.example.basic_jwt_app.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic_jwt_app.model.User;
import com.example.basic_jwt_app.service.UserServices;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserServices userServices; // Properties injection

    @GetMapping("/users")
    public List<User> getUsers() {
        return userServices.getAllUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}
