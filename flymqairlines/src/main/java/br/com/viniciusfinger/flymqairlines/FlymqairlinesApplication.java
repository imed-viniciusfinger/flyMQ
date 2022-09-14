package br.com.viniciusfinger.flymqairlines;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class FlymqairlinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlymqairlinesApplication.class, args);
	}

}
