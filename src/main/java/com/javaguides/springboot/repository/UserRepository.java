package com.javaguides.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.modal.User;

public interface UserRepository extends JpaRepository<User, Integer> {

Optional<User> findUserByEmail(String email);
}
