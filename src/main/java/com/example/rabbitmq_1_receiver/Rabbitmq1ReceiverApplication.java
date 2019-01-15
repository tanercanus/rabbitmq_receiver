package com.example.rabbitmq_1_receiver;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tanermappper.rabbitmq_mapper.RabbitMQConstants;

@SpringBootApplication
public class Rabbitmq1ReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Rabbitmq1ReceiverApplication.class, args);
    }

    /*@Bean
    public TopicExchange exchange() {
        return new TopicExchange(RabbitMQConstants.EXCHANGE_NAME);
    }

    @Bean
    public Queue queue() {
        return new Queue(RabbitMQConstants.DEFAULT_PARSING_QUEUE);
    }
*/
   // @Bean
   // public Binding binding(/*Queue queue, TopicExchange exchange*/) {
  //      return BindingBuilder.bind(queue()).to(exchange()).with(RabbitMQConstants.ROUTING_KEY);
   // }
}

