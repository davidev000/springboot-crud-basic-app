package com.example.provaAppSpring.services.impl;

import com.example.provaAppSpring.model.User;
import com.example.provaAppSpring.repository.UserRepository;
import com.example.provaAppSpring.repository.impl.UserRepositoryImpl;
import com.example.provaAppSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getList() {
        return userRepository.getList();
    }
}
