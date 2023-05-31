/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 *
 * @author devfilsk
 */
public class RabbitMQConnect {
    private static final String EXCHANGE_NAME = "topic_exchange";
    
    public Channel connect() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("guest");
        factory.setPassword("guest");

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            // Declaração da exchange
            channel.exchangeDeclare(EXCHANGE_NAME, "topic");

            return channel;
            // Mensagem a ser enviada
//            String message = "Hello, RabbitMQ!";

            // Publica a mensagem na exchange com a routing key
//            channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY, null, message.getBytes());
//            System.out.println("Mensagem enviada: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
