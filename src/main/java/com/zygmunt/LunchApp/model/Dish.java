package com.zygmunt.LunchApp.model;

import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Dish {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotNull
    @Min(1)
    private Integer quantity;

    @NotNull
    private Product product;

    @Nullable
    @ManyToMany(mappedBy = "dishes")
    private List<MenuItem> menuItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Nullable
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(@Nullable List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
