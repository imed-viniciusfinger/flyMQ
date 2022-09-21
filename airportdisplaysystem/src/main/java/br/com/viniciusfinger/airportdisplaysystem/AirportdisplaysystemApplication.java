package br.com.viniciusfinger.airportdisplaysystem;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class AirportdisplaysystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportdisplaysystemApplication.class, args);
	}

}
