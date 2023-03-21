package com.example.provaAppSpring.controller;

import com.example.provaAppSpring.model.User;
import com.example.provaAppSpring.repository.UserRepository;
import com.example.provaAppSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    public UserService userService;


    @GetMapping("/users")
    List<User> getUsers(){
        return userService.getList();
    }
}
