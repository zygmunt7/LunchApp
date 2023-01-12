package com.zygmunt.LunchApp.model;

import com.zygmunt.LunchApp.model.enums.Archive;
import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotNull
    @Embedded
    private PersonalData personalData;

    @Nullable
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DeliveryAddress> addresses;

    @NotNull
    @Embedded
    private  LogginData logginData;

    @NotNull
    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    @NotNull
    @OneToMany
            (mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private  List<OperationEvidence> operationEvidences;

    @Nullable
    @ManyToMany(mappedBy = "user")
    private List<DiscountCode> discountCodes;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Archive archive;

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

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Nullable
    public List<DeliveryAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(@Nullable List<DeliveryAddress> addresses) {
        this.addresses = addresses;
    }

    public LogginData getLogginData() {
        return logginData;
    }

    public void setLogginData(LogginData logginData) {
        this.logginData = logginData;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<OperationEvidence> getOperationEvidences() {
        return operationEvidences;
    }

    public void setOperationEvidences(List<OperationEvidence> operationEvidences) {
        this.operationEvidences = operationEvidences;
    }

    @Nullable
    public List<DiscountCode> getDiscountCodes() {
        return discountCodes;
    }

    public void setDiscountCodes(@Nullable List<DiscountCode> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }
}
