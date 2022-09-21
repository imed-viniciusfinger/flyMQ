package com.viniciusfinger.FlyMQAirlinesSystem;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class FlyMqAirlinesSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyMqAirlinesSystemApplication.class, args);
	}

}
