package com.zygmunt.LunchApp.model;

import com.zygmunt.LunchApp.model.enums.EvidenceType;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.apache.catalina.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class OperationEvidence {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Instant data;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EvidenceType type;

    @Column(scale = 2, precision = 12)
    @Digits(integer = 10, fraction = 2)
    @Min(0)
    private BigDecimal amount;

    @NotNull
    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public EvidenceType getType() {
        return type;
    }

    public void setType(EvidenceType type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
