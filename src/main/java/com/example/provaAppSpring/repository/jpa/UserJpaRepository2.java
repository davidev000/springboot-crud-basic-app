package com.example.provaAppSpring.repository.jpa;

import com.example.provaAppSpring.model.User;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserJpaRepository2 {

    public List<User> findAll() {
        return Collections.emptyList();
    }
}
