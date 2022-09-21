package com.viniciusfinger.FlyMQAirlinesSystem.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class LandingConfirmation {
    
    @RabbitListener(queues = "${queue.landing-confirmation}")
    public void landingConfirmationListener(@Payload String landingConfirmationJSON){
        System.out.println("Atenção: Autorizado o pouso: " + landingConfirmationJSON);
    }
}
