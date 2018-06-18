package com.turkmen.security.JWT_With_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.turkmen")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class JwtWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtWithSpringBootApplication.class, args);
	}
}
