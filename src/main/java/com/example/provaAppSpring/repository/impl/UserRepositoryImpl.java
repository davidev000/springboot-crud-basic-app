package com.example.provaAppSpring.repository.impl;

import com.example.provaAppSpring.model.User;
import com.example.provaAppSpring.repository.UserRepository;
import com.example.provaAppSpring.repository.jpa.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public List<User> getList() {
        return userJpaRepository.findAll();
    }
}
