package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class StudentCrudOperationApplication {

	public static void main(String[] args) 
	{
		System.out.println("This is student class crud operation");
		SpringApplication.run(StudentCrudOperationApplication.class, args);
	}

}
