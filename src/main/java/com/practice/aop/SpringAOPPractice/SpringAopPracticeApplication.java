package com.practice.aop.SpringAOPPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.aop.SpringAOPPractice.service.Business1;

@SpringBootApplication
public class SpringAopPracticeApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringAopPracticeApplication.class, args);
		Business1 busines = new Business1();
		busines.calculateSomething();

	}

}
