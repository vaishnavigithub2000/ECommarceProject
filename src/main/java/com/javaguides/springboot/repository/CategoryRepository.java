package com.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.modal.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
