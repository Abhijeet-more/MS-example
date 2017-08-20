package com.websystique.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class LoginApp {

	public static void main(String[] args) {
		SpringApplication.run(LoginApp.class, args);
	}
}
