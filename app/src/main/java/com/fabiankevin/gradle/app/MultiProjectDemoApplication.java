package com.fabiankevin.gradle.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages = {"com.fabiankevin.*"})
@EntityScan(basePackages = {"com.fabiankevin.gradle"})
@EnableJpaRepositories(basePackages = {"com.fabiankevin.gradle"})
public class MultiProjectDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MultiProjectDemoApplication.class, args);
	}

}
