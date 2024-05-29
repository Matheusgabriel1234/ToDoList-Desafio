package com.example.toDoList_Desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.toDoList_Desafio.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {



}
