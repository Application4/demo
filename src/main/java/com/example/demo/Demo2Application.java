package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	@Value("${server.port}")
	private String port;

	public Demo2Application(){
		System.out.println("PORT : "+port);
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
