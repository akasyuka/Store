package com.akasyuka.website.entity;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    private String productSKU;
    private String productName;
    private Float productPrice;
    private Float productWeight;
    private String productCartDesc;
    private String productShortDesc;
    private String productLongDesc;
    private String productThumb;
    private String productImage;

    @ManyToOne
    @JoinColumn(name = "productCategoryId")
    private ProductCategory productCategory;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date productUpdateDate;

    private Float productStock;
    private Integer productLive;
    private Integer productUnlimited;
    private String productLocation;

    public Product(Long productId, String productSKU, String productName, Float productPrice, Float productWeight, String productCartDesc, String productShortDesc, String productLongDesc, String productThumb, String productImage, ProductCategory productCategory, Date productUpdateDate, Float productStock, Integer productLive, Integer productUnlimited, String productLocation) {
        this.productId = productId;
        this.productSKU = productSKU;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.productCartDesc = productCartDesc;
        this.productShortDesc = productShortDesc;
        this.productLongDesc = productLongDesc;
        this.productThumb = productThumb;
        this.productImage = productImage;
        this.productCategory = productCategory;
        this.productUpdateDate = productUpdateDate;
        this.productStock = productStock;
        this.productLive = productLive;
        this.productUnlimited = productUnlimited;
        this.productLocation = productLocation;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Float getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Float productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductCartDesc() {
        return productCartDesc;
    }

    public void setProductCartDesc(String productCartDesc) {
        this.productCartDesc = productCartDesc;
    }

    public String getProductShortDesc() {
        return productShortDesc;
    }

    public void setProductShortDesc(String productShortDesc) {
        this.productShortDesc = productShortDesc;
    }

    public String getProductLongDesc() {
        return productLongDesc;
    }

    public void setProductLongDesc(String productLongDesc) {
        this.productLongDesc = productLongDesc;
    }

    public String getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(String productThumb) {
        this.productThumb = productThumb;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Date getProductUpdateDate() {
        return productUpdateDate;
    }

    public void setProductUpdateDate(Date productUpdateDate) {
        this.productUpdateDate = productUpdateDate;
    }

    public Float getProductStock() {
        return productStock;
    }

    public void setProductStock(Float productStock) {
        this.productStock = productStock;
    }

    public Integer getProductLive() {
        return productLive;
    }

    public void setProductLive(Integer productLive) {
        this.productLive = productLive;
    }

    public Integer getProductUnlimited() {
        return productUnlimited;
    }

    public void setProductUnlimited(Integer productUnlimited) {
        this.productUnlimited = productUnlimited;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }
}
