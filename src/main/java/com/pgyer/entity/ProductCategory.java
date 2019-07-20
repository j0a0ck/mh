package com.pgyer.entity;

import java.io.Serializable;

public class ProductCategory implements Serializable {
    private Integer productCategoryId;

    private String productCategoryName;

    private Integer productCategoryUpper;

    private static final long serialVersionUID = 1L;

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    public Integer getProductCategoryUpper() {
        return productCategoryUpper;
    }

    public void setProductCategoryUpper(Integer productCategoryUpper) {
        this.productCategoryUpper = productCategoryUpper;
    }
}