package com.example.rabbitmq_1_receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import tanermappper.rabbitmq_mapper.MessageCore;
import tanermappper.rabbitmq_mapper.RabbitMQConstants;

@Service
public class PracticalTypeListener {

    private static final Logger log = LoggerFactory.getLogger(PracticalTypeListener.class);

    /*@RabbitListener(queues = Rabbitmq1ReceiverApplication.DEFAULT_PARSING_QUEUE)
    public void receiveMessage(final Message messageCore) {
        log.info("Received message as specific class: {}", messageCore.toString());
    }*/


    @RabbitListener(queues = RabbitMQConstants.DEFAULT_PARSING_QUEUE)
    public void receiveMessage(final Message message) {
        System.out.println(message);

        MessageCore messageCore = (MessageCore) message.getPayload();

        System.out.println(messageCore.getMessageClass());

        //log.info("Received message as specific class: {}", messageCore.toString());
    }


}
