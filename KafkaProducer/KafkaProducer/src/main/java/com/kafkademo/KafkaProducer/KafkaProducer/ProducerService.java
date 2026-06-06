package com.kafkademo.KafkaProducer.KafkaProducer;

import com.kafkademo.KafkaProducer.DTO.ChatMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final KafkaTemplate<String, ChatMessage> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, ChatMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(ChatMessage message){
        kafkaTemplate.send(
                "chat-message",
                message.getReceiver(),
                message
        );
        System.out.println("Message Produced : "+message);
    }
}
