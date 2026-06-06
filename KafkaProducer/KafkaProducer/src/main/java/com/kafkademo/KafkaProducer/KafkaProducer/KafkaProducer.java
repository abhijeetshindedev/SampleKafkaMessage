package com.kafkademo.KafkaProducer.KafkaProducer;

import com.kafkademo.KafkaProducer.DTO.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class KafkaProducer {

    @Autowired
    private ProducerService chatProducer;
    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody ChatMessage message){
        chatProducer.send(message);
        return "Message Sent..........";
    }

}
