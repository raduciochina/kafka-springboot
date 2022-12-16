package com.example.kafkaspringboot.controller;

import com.example.kafkaspringboot.kafka.KafkaJsonProducer;
import com.example.kafkaspringboot.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageJsonController {

    private KafkaJsonProducer kafkaJsonProducer;

    @Autowired
    public MessageJsonController(KafkaJsonProducer kafkaJsonProducer) {
        this.kafkaJsonProducer = kafkaJsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaJsonProducer.sendMessage(user);
        return ResponseEntity.ok().body("JSON Message sent to the Kafka Topic Successfully");
    }

}
