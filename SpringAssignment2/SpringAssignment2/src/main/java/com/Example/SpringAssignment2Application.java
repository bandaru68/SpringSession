package com.Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.Example.controller","com.Example.repository","com.Example.dao","com.Example.model"})
public class SpringAssignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAssignment2Application.class, args);
	}

}
