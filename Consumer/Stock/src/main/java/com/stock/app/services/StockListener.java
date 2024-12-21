package com.stock.app.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stock.app.entites.Order;

@Service
public class StockListener {

    @KafkaListener(topics = "stock-topic",
    groupId = "_confluent-controlcenter-7-3-0-1-command-9aa8c0a7-90ea-46d8-8cde-08a24724f4f6-StreamThread-1-consumer-c77063df-c85e-43e2-bbde-bbdef6b40d37"
    ) //containerFactory = "kafkaListenerContainerFactory"
    public void sellOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " has been sold");
    }

}
