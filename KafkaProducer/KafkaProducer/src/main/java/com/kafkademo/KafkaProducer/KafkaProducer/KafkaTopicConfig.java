package com.kafkademo.KafkaProducer.KafkaProducer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic chatTopic(){
        return TopicBuilder
                .name("chat-messages")
                .partitions(6)
                .replicas(1)
                .build();
    }

}
