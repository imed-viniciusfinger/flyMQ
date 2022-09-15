package br.com.viniciusfinger.gasolinerechargesystem.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RefuelPlaneListener {
    
    @RabbitListener(queues = {"${queue.refuel-plane}"})
    public void receiveRefuelPlaneOrder(@Payload String refuelPlaneOrderJSON){
        System.out.println(refuelPlaneOrderJSON);
    }
}
