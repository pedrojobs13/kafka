package com.pedrolg.kaftaexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListeners {

    @KafkaListener(topics = "payment", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
