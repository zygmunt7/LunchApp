package com.zygmunt.LunchApp.model;


import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity public class DiscountCode {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotBlank
    private String code;

    @Column(scale = 2, precision = 12)
    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal bigDecimal;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DiscountUnit discountUnit;

    @Nullable
    @ManyToMany
    private List<User> user;

    @Nullable
    @ManyToMany
    private List<Restaurant> restaurants;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public DiscountUnit getDiscountUnit() {
        return discountUnit;
    }

    public void setDiscountUnit(DiscountUnit discountUnit) {
        this.discountUnit = discountUnit;
    }

    @Nullable
    public List<User> getUser() {
        return user;
    }

    public void setUser(@Nullable List<User> user) {
        this.user = user;
    }

    @Nullable
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(@Nullable List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
