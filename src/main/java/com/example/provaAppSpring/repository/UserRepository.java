package com.example.provaAppSpring.repository;
import com.example.provaAppSpring.model.User;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserRepository {

   public List<User> getList();
}
