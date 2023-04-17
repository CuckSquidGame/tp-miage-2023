package com.acme.todolist;

import com.acme.todolist.domain.TodoItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

@SpringBootTest(classes = TodoItem.class)
class TodolistApplicationTests {

	@Test
	void contextLoads() {
	}

	//A compléter

	@Test
	void testLate(){
		TodoItem todoItem = new TodoItem("TU1", Instant.now().minus(2, ChronoUnit.DAYS), "You're late");
		Assertions.assertEquals("[LATE!] You're late", todoItem.finalContent());
	}

	@Test
	void testNotLate(){
		TodoItem todoItem = new TodoItem("TU2", Instant.now(), "A wizard is never late, nor is he early, he arrives precisely when he means to.");
		Assertions.assertEquals("A wizard is never late, nor is he early, he arrives precisely when he means to.", todoItem.finalContent());
	}

}
