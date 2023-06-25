package com.demo.bredit;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(BreditApplication.class, args);


		QuestionApplication questionApplication = new QuestionApplication();
		System.out.println("Question 1: " + questionApplication.question1(4));
		System.out.println(
				"Question 2: " + questionApplication.question2(Arrays.asList(1, 2, 3, 5, 2), 2));
		System.out.println("Question 3: " + questionApplication.question3(4, 6, 2, 4));

		// questionApplication.scanInput();
	}
}
