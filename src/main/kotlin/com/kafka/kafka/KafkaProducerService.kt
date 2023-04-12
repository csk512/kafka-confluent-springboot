package com.kafka.kafka

import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducerService(private val kafkaTemplate: KafkaTemplate<String, String>) {
    fun publishMessage(message: String) {
        val record: ProducerRecord<String, String> = ProducerRecord("kafka.learning.orders", "key", message)
        try {
            kafkaTemplate.send(record)
        } catch (ex: Exception) {
            print(ex)
        }
    }
}