package org.simplilend.loanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanappApplication {

	public static void main(String[] args) {
		System.out.println("Application is being started");
		SpringApplication.run(LoanappApplication.class, args);
		System.out.println("Application has statred");
	}
}
