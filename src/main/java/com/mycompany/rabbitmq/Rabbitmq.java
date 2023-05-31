/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rabbitmq;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
/**
 *
 * @author devfilsk
 */
public class Rabbitmq {
    
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
         // Configuração da conexão com o RabbitMQ
        
        Channel connection = new RabbitMQConnect().connect();
         
        connection.basicPublish(ROUTING_KEY, ROUTING_KEY, null, bytes);

        // Mensagem a ser enviada
        String message = "Hello, RabbitMQ!";

        // Publica a mensagem na exchange com a routing key
        connection.basicPublish(EXCHANGE_NAME, ROUTING_KEY, null, message.getBytes());
        System.out.println("Mensagem enviada: " + message);
      
    }
}
