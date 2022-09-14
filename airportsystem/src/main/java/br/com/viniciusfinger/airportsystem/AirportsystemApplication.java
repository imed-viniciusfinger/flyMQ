package br.com.viniciusfinger.airportsystem;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class AirportsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportsystemApplication.class, args);
	}

}
