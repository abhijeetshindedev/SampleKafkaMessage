package com.kafkademo.KafkaProducer.KafkaProducer;

import com.kafkademo.KafkaProducer.DTO.ChatMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ChatConsumer {

    @KafkaListener(
            topics = "chat-message",
            groupId = "chat-group")
    public void consume(ChatMessage message){
        System.out.println("Message Consumed : "+message);
    }
}
