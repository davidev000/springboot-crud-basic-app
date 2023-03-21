package com.example.provaAppSpring.services;

import com.example.provaAppSpring.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> getList();
}
