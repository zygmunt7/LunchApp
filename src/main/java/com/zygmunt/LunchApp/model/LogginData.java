package com.zygmunt.LunchApp.model;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LogginData {

    @Column(unique = true)
    @Size(min = 3)
    private String string;

    @Pattern(regexp = "(?=.*[az])(?=.*[A-Z])(?=.*\\d).{6,}$")
    private String password;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
