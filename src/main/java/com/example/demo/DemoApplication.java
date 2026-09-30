// Defines the package where this Java class belongs.
// Think of a package as a folder that organizes Java classes.
package com.example.demo;


// Imports SpringApplication.
// SpringApplication is used to start/run a Spring Boot application.
import org.springframework.boot.SpringApplication;

// Imports the @SpringBootApplication annotation.
// This annotation tells Spring Boot that this is the main application class.
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @SpringBootApplication tells Spring Boot that this class
// is the starting point of the Spring Boot application.
//
// It combines three important Spring annotations:
// 1. @Configuration
// 2. @EnableAutoConfiguration
// 3. @ComponentScan
@SpringBootApplication
public class DemoApplication {

	// This is the main() method.
	// Java starts executing the program from this method.
	public static void main(String[] args) {

		// Starts the Spring Boot application.
		//
		// DemoApplication.class tells Spring Boot which class
		// contains the main configuration.
		//
		// args contains any command-line arguments passed to the application.
		//
		// SpringApplication.run() starts:
		// - Spring Application Context
		// - Embedded server (such as Tomcat)
		// - Auto-configuration
		// - Spring beans
		SpringApplication.run(DemoApplication.class, args);
	}
}