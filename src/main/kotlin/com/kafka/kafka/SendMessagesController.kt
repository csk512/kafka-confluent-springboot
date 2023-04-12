package com.kafka.kafka

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SendMessagesController {

    @Autowired
    private lateinit var kafkaProducerExample: KafkaProducerService

    @PostMapping("/v1/api")
    fun sendMessages(@RequestParam message: String) {
        kafkaProducerExample.publishMessage(message)
    }
}