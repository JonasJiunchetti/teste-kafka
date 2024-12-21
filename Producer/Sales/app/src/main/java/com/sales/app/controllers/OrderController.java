package com.sales.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.app.entities.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private KafkaTemplate<Long, Order> kafkaTemplate;

    @PostMapping("/sell")
    @Transactional()
    ResponseEntity<Order> sellOrder(@RequestBody Order order) {
        kafkaTemplate.send("stock-topic",order.getOrderId(), order);
        kafkaTemplate.flush();
        return ResponseEntity.ok(order);
    }

}
