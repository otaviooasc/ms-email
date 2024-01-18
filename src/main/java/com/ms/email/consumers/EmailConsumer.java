package com.ms.email.consumers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.email.dto.EmailRecordsDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordsDto emailRecordsDto) {
        System.out.println(emailRecordsDto.emailTo());
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        ObjectMapper objectMapper= new ObjectMapper();
        return new Jackson2JsonMessageConverter(objectMapper);
    }

}
