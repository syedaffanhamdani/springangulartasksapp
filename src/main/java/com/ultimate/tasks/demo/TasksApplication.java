package com.ultimate.tasks.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import service.TaskService;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {

		SpringApplication.run(TasksApplication.class, args);
	}

/*
	@Bean
	CommandLineRunner runner(TaskService){

	}
	*/
}

