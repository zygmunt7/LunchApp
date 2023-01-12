package com.zygmunt.LunchApp.model;


import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("deliverer")
public class Deliverer extends Employee{

    @Nullable
    @OneToMany(mappedBy = "deliverer")
    private List<Order> orders;

    @Nullable

    @Nullable
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(@Nullable List<Order> orders) {
        this.orders = orders;
    }
}
