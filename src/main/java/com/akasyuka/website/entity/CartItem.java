package com.akasyuka.website.entity;

import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

import javax.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int quantity;


    public CartItem(Integer id, Product product, Customer customer, int quantity) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }
}
