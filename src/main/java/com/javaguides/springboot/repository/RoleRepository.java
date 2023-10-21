package com.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.modal.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
