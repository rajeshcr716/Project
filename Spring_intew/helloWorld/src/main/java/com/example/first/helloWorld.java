package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class} )
public class helloWorld {

	public static void main(String[] args) {
		SpringApplication.run(helloWorld.class, args);
	}

}
