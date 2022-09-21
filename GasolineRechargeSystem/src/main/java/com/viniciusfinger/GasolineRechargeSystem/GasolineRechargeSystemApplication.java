package com.viniciusfinger.GasolineRechargeSystem;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class GasolineRechargeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasolineRechargeSystemApplication.class, args);
	}

}
