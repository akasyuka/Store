package com.akasyuka.website.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "orderUserId")
    private User user;

    private Integer orderUsedId;
    private Float orderAmount;
    private String orderShipName;
    private String orderShipAddress;
    private String orderShipAddress2;
    private String orderCity;
    private String orderState;
    private String orderZip;
    private String orderCountry;
    private String orderPhone;
    private String orderFax;
    private Float orderShipping;
    private Float orderTax;
    private String orderEmail;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    private Integer orderShipped;
    private String orderTrackingNumber;

    public Order(Long orderId, User user, Integer orderUsedId, Float orderAmount, String orderShipName, String orderShipAddress, String orderShipAddress2, String orderCity, String orderState, String orderZip, String orderCountry, String orderPhone, String orderFax, Float orderShipping, Float orderTax, String orderEmail, Date orderDate, Integer orderShipped, String orderTrackingNumber) {
        this.orderId = orderId;
        this.user = user;
        this.orderUsedId = orderUsedId;
        this.orderAmount = orderAmount;
        this.orderShipName = orderShipName;
        this.orderShipAddress = orderShipAddress;
        this.orderShipAddress2 = orderShipAddress2;
        this.orderCity = orderCity;
        this.orderState = orderState;
        this.orderZip = orderZip;
        this.orderCountry = orderCountry;
        this.orderPhone = orderPhone;
        this.orderFax = orderFax;
        this.orderShipping = orderShipping;
        this.orderTax = orderTax;
        this.orderEmail = orderEmail;
        this.orderDate = orderDate;
        this.orderShipped = orderShipped;
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public Order() {
    }
}
