package com.example.toDoList_Desafio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Todos")
public class Todo {
@jakarta.persistence.Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String description;
private boolean accomplished;
private int priority;

public Todo() {
	
}







public Todo(Long id, String name, String description, boolean accomplished, int priority) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.accomplished = accomplished;
	this.priority = priority;
}







public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public boolean isAccomplished() {
	return accomplished;
}

public void setAccomplished(boolean accomplished) {
	this.accomplished = accomplished;
}

public int getPriority() {
	return priority;
}

public void setPriority(int priority) {
	this.priority = priority;
}




}
