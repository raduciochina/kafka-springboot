package com.example.kafkaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringbootApplication.class, args);
	}


}
