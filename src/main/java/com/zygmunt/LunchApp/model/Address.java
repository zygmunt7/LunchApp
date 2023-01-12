package com.zygmunt.LunchApp.model;

import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.NotNull;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @NotNull
    private String street;

    @NotNull
    private String streetNumber;

    @NotNull
    private String localnumber;

    @NotNull
    private String city;

    @Nullable
    private String borough;

    @Nullable
    private String country;

    @Nullable
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocalnumber() {
        return localnumber;
    }

    public void setLocalnumber(String localnumber) {
        this.localnumber = localnumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Nullable
    public String getBorough() {
        return borough;
    }

    public void setBorough(@Nullable String borough) {
        this.borough = borough;
    }

    @Nullable
    public String getCountry() {
        return country;
    }

    public void setCountry(@Nullable String country) {
        this.country = country;
    }

    @Nullable
    public String getState() {
        return state;
    }

    public void setState(@Nullable String state) {
        this.state = state;
    }
}


