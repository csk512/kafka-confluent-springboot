package com.kafka.kafka

import org.apache.kafka.clients.admin.AdminClientConfig
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class TopicConfiguration {
    @Bean
    fun topic1(): NewTopic? {
        return TopicBuilder.name("TOPIC-1")
            .partitions(10)
            .replicas(3)
            .compact()
            .build();
    }

    @Bean
    fun topic2(): NewTopic? {
        return TopicBuilder.name("TOPIC-2")
            .partitions(10)
            .replicas(3)
            .compact()
            .build();
    }
}