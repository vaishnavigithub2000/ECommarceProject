package com.javaguides.springboot.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Category {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name = "category_id")
private int id;

private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}




}
