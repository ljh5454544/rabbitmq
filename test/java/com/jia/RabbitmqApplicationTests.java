package com.jia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {


    @Autowired
    RabbitTemplate rabbitTemplate;


    @Autowired
    AmqpAdmin amqpAdmin;

    /**
     *  测试点对点通信
     * */
    @Test
    public void testDirect(){
//        Message msg = new Message(new String("message").getBytes(), new MessageProperties());
//        rabbitTemplate.send("exchange" , "routingKey",msg);  // Message 自己构造  定义一个消息头和消息体内容

        // 只需要传入要发送的对象, 自动序列化
        //rabbitTemplate.convertAndSend("","","");

//        HashMap<String, Object> map = new HashMap<>();
//        map.put("k1","v1");
//        map.put("k2","v2");
//        map.put("k3","v3");
//        map.put("k4","v4");
//        rabbitTemplate.convertAndSend("exchange.direct","jia",map);


        amqpAdmin.declareBinding(new Binding("superSmart",Binding.DestinationType.QUEUE,"exchange.direct","superSmart",null));

//        Object jia = rabbitTemplate.receiveAndConvert("jia");
//        Map maps = (Map) jia;
//        System.out.println(maps);
    }

}
