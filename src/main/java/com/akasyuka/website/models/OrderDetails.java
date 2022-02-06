package com.akasyuka.website.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long detailsId;
//Разобраться!
    private Long detailsOrderId;
    private Long detailGoodsId;

    private String detailName;
    private Float detailPrice;

    public OrderDetails(Long detailsOrderId, Long detailGoodsId, String detailName, Float detailPrice) {
        this.detailsOrderId = detailsOrderId;
        this.detailGoodsId = detailGoodsId;
        this.detailName = detailName;
        this.detailPrice = detailPrice;
    }

    public OrderDetails() {
    }

    public Long getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Long detailsId) {
        this.detailsId = detailsId;
    }

    public Long getDetailsOrderId() {
        return detailsOrderId;
    }

    public void setDetailsOrderId(Long detailsOrderId) {
        this.detailsOrderId = detailsOrderId;
    }

    public Long getDetailGoodsId() {
        return detailGoodsId;
    }

    public void setDetailGoodsId(Long detailGoodsId) {
        this.detailGoodsId = detailGoodsId;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public Float getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(Float detailPrice) {
        this.detailPrice = detailPrice;
    }
}
