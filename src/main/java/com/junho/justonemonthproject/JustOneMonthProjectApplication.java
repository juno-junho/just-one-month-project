package com.junho.justonemonthproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class JustOneMonthProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustOneMonthProjectApplication.class, args);
	}

}
