package com.example.toDoList_Desafio.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.toDoList_Desafio.entities.Todo;
import com.example.toDoList_Desafio.repositories.TodoRepository;

@Service
public class todoService {

private TodoRepository repository;

public todoService(TodoRepository repository) {

	this.repository = repository;
}

public List<Todo> getAll(){
Sort sort = Sort.by("priority").descending().and(Sort.by("name").ascending());
return repository.findAll(sort);
}

public List<Todo> create(Todo todo){
repository.save(todo);
return getAll();	
}


public List<Todo> update(Todo todo){
repository.save(todo);
return getAll();
}

public List<Todo> delete(Long id){
repository.deleteById(id);	
return getAll();
}
	
}
