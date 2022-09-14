package br.com.viniciusfinger.gasolinerechargesystem;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class GasolinerechargesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasolinerechargesystemApplication.class, args);
	}

}
