package com.cr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories("com.cr")
@SpringBootApplication(scanBasePackages = { "com.cr" })
public class TestThreeSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(TestThreeSpringBoot.class, args);

	}

}
