package com.akasyuka.website.entity;


import javax.persistence.*;

@Entity
@Table(name = "orderDetails")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long detailId;

    @ManyToOne
    @JoinColumn(name = "detailOrderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "detailProductId")
    private Product product;

    private String detailName;
    private Float detailPrice;
    private String detailSKU;
    private Integer detailQuantity;

    public OrderDetail(Long detailId, Order order, Product product, String detailName, Float detailPrice, String detailSKU, Integer detailQuantity) {
        this.detailId = detailId;
        this.order = order;
        this.product = product;
        this.detailName = detailName;
        this.detailPrice = detailPrice;
        this.detailSKU = detailSKU;
        this.detailQuantity = detailQuantity;
    }

    public OrderDetail() {
    }
}
