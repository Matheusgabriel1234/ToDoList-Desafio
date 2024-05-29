package com.example.toDoList_Desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.toDoList_Desafio.entities.Todo;
import com.example.toDoList_Desafio.service.todoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/posts")
public class toDoController {

private todoService service;

public toDoController(todoService service) {
this.service = service;
}

@PostMapping
public List<Todo> create(@RequestBody Todo todo){
	return service.create(todo);
}

@GetMapping
public List<Todo> getAll(){
	return service.getAll();
}

@DeleteMapping("/{id}")
public List<Todo> delete(@PathVariable Long Id) {
    return service.delete(Id);
}

@PutMapping
public List<Todo> update(@RequestBody Todo todo){
	return service.update(todo);
}



}
