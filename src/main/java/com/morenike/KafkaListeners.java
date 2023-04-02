package com.morenike;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "renny", groupId = "First")
    void listener(String data) {
        System.out.println("Listener received: " + data + " oop");
    }
}
