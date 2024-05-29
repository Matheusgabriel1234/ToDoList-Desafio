package com.example.toDoList_Desafio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.example.toDoList_Desafio.entities.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ToDoListDesafioApplicationTests {
	
	@Autowired
    WebTestClient testClient;

	@Test
	void todoCreateSucess() {
		var todo = new Todo(null,"todo1","todo today",false,1);
		testClient.post().uri("/posts").bodyValue(todo).exchange().expectStatus().isOk().expectBody()
		.jsonPath("$.length()").isEqualTo(1)
		.jsonPath("$[0].name").isEqualTo(todo.getName())
		.jsonPath("$[0].description").isEqualTo(todo.getDescription())
		.jsonPath("$[0].priority").isEqualTo(todo.getPriority())
		.jsonPath("$[0].accomplished").isEqualTo(todo.isAccomplished())
		
		;
	}
	
	@Test
	void todoCreateFailure() {
	}

}
