package com.viniciusfinger.AirportSystem.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

public class ArrivingPlane {
    
    @RabbitListener(queues = "${queue.update-arriving-plane}")
    public void arrivingPlaneListener(@Payload String arrivingPlaneJSON){
        System.out.println("Avião está chegando avião: " + arrivingPlaneJSON);
    }
}
