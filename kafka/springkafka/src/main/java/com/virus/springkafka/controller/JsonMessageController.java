package com.virus.springkafka.controller;

import com.virus.springkafka.Entity.User;
import com.virus.springkafka.kafka.JsonKafkaProduser;
import com.virus.springkafka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class JsonMessageController {


    private JsonKafkaProduser kafkaProducer;


    public JsonMessageController(JsonKafkaProduser kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JsonMessage sent to kafka topic");
    }
}
