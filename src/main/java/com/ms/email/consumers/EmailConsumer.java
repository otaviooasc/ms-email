package com.ms.email.consumers;

import com.ms.email.dto.EmailRecordsDto;
import com.ms.email.models.EmailModel;
import com.ms.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    private EmailService service;

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordsDto emailRecordsDto) {
        System.out.println(emailRecordsDto.emailTo());
        var emailModel = new EmailModel();
        BeanUtils.copyProperties(emailRecordsDto, emailModel);

        service.sendEmail(emailModel);
    }
}
