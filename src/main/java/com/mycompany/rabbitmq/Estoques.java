/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rabbitmq;

import com.rabbitmq.client.Channel;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author devfilsk
 */
public class Estoques {
    private static final String ROUTING_KEY = "routing.key";  
    private static final String EXCHANGE_NAME = "topic_exchange";

    
    public void enviarMensagem() {
        
        JSONObject my_obj = new JSONObject();
        
        String message = "";
        
        Channel connection = new RabbitMQConnect().connect();
        connection.basicPublish(ROUTING_KEY, ROUTING_KEY, null, bytes);
    }
}
