package com.QA.SpringBootDBApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DvdDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdDatabaseApplication.class, args);
	}
}
