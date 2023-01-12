package com.zygmunt.LunchApp.model;

import jakarta.validation.constraints.NotNull;

import javax.persistence.Embeddable;
import java.time.Instant;

@Embeddable
public class OrderStatus {
    @NotNull
    private Instant orderTime;

    @NotNull
    private Instant isPaid;

    @NotNull
    private Instant giveOutTime;

    @NotNull
    private Instant deliveryTime;

    public Instant getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Instant orderTime) {
        this.orderTime = orderTime;
    }

    public Instant getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Instant isPaid) {
        this.isPaid = isPaid;
    }

    public Instant getGiveOutTime() {
        return giveOutTime;
    }

    public void setGiveOutTime(Instant giveOutTime) {
        this.giveOutTime = giveOutTime;
    }

    public Instant getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Instant deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
