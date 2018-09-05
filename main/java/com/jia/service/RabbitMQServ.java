package com.jia.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RabbitMQServ {

    @RabbitListener(queues = "jia")
    public void getMessage1(Message message){
        System.out.println("getMessage1 收到消息");
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }

//    @RabbitListener(queues = "jia")
//    public void getMessage2(Map map){
//        System.out.println("getMessage2 收到消息");
//        System.out.println(map);
//    }


}
