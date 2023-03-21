package com.example.provaAppSpring.repository.jpa;

import com.example.provaAppSpring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<User,Long> {
}
