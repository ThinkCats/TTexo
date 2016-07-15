package com.texo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.texo.**")
@SpringBootApplication
public class TexoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TexoApplication.class, args);
	}
}
