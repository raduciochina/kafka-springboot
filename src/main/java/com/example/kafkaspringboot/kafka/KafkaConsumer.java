package com.example.kafkaspringboot.kafka;

import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    public void consumeMessage(String message){
        System.out.println("Consumed message: " + message);
    }

}
