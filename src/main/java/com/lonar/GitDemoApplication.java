
package com.lonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
		System.out.println("this is not corrects");
 
		System.out.println("this is second line");
 
		System.out.println("this is first");
 
	}

}
