package com.viniciusfinger.AirportDisplaySystem.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class UpdateArrivingPlane {
    
    @RabbitListener(queues = "${queue.update-arriving-plane}")
    public void updateArrivingPlaneListener(@Payload String arrivingPlaneJSON){
        System.out.println("Atualizando chegada do avião: " + arrivingPlaneJSON);
    }
}
