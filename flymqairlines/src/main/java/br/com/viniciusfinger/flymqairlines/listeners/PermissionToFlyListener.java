package br.com.viniciusfinger.flymqairlines.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class PermissionToFlyListener {
    
    @RabbitListener(queues = "${queue.landing-confirmation}")
    public void ReceiveLandingConfirmation(@Payload String landingConfirmationJSON){
        System.out.println("Landing confirmation to fly: " + landingConfirmationJSON);
    }    
}
