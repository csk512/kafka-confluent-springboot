package com.kafka.kafka

import io.mockk.*
import org.apache.kafka.clients.producer.ProducerRecord
import org.junit.jupiter.api.Test
import org.springframework.kafka.core.KafkaTemplate


class KafkaProducerServiceTest(){
    private val kafkaTemplate: KafkaTemplate<String, String> = mockk()
    private val kafkaProducerExample = KafkaProducerService(kafkaTemplate)

    @Test
    fun `kafkaTemplate send is being called`() {
        kafkaProducerExample.publishMessage("test123")

        verify (exactly = 1){
            kafkaTemplate.send(any<ProducerRecord<String, String>>())
        }
    }

}