package com.pedrolg.kaftaexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KaftaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaftaExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 100; i++) {

                kafkaTemplate.send("payment", "fala jogador " + i);
            }
        };
    }
}
