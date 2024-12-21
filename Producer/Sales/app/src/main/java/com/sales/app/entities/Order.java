package com.sales.app.entities;

import java.math.BigDecimal;
import java.time.Instant;

public class Order {
    
    private Long orderId;
    private Long productId;
    private BigDecimal price;
    private Integer quantity;
    private Instant date;

    public Order() {
    }

    public Order(Long orderId, Long productId,BigDecimal price, Integer quantity, Instant date) {
        this.orderId = orderId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }
    
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

}
