package com.example.kafkaspringboot.kafka;

import com.example.kafkaspringboot.payload.User;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    private static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(topics="exampleTopicJson", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("$$ -> JSON Consumed Message -> %s", user.toString()));
    }

}
