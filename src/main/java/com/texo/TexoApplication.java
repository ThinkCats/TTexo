package com.texo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication

@ConfigurationProperties(locations = {"*.properties"})
public class TexoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TexoApplication.class, args);
	}
}
