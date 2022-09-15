package br.com.viniciusfinger.airportsystem.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class ArrivingPlaneListener {
    
    @RabbitListener(queues = "${queue.ArrivingPlaneQueue}")
    public void receiveArrivingPlaneAdvice(@Payload String arrivingPlaneAdviceJSON){
        System.out.println("Atenção: Avião chegando: " + arrivingPlaneAdviceJSON);
    }
}
