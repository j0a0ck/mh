package com.pgyer.entity;

import java.io.Serializable;

public class ShopCategory implements Serializable {
    private Integer shopCategoryId;

    private String shopCategoryName;

    private String shopCategoryUpper;

    private static final long serialVersionUID = 1L;

    public Integer getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Integer shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName == null ? null : shopCategoryName.trim();
    }

    public String getShopCategoryUpper() {
        return shopCategoryUpper;
    }

    public void setShopCategoryUpper(String shopCategoryUpper) {
        this.shopCategoryUpper = shopCategoryUpper == null ? null : shopCategoryUpper.trim();
    }
}