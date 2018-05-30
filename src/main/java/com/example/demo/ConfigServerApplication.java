package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}

//http://localhost:8888/limits-service/default
//http://localhost:8888/limits-service/qa
//http://localhost:8888/limits-service/dev

//https://cloud.spring.io/spring-cloud-config/
//https://spring.io/guides/gs/centralized-configuration/


