package com.pgyer.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer productId;

    private String productName;

    private String productPrice;

    private Integer restrictionNumber;

    private Integer inventory;

    private String productCategoryId;

    private String productUseAddress;

    private Double giveGoldPercent;

    private Double shopDeduPercent;

    private Double promotionAwardPercent;

    private Integer productStatus;

    private String shopId;

    private String saleNum;

    private String productContent;

    private String buysNotes;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice == null ? null : productPrice.trim();
    }

    public Integer getRestrictionNumber() {
        return restrictionNumber;
    }

    public void setRestrictionNumber(Integer restrictionNumber) {
        this.restrictionNumber = restrictionNumber;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId == null ? null : productCategoryId.trim();
    }

    public String getProductUseAddress() {
        return productUseAddress;
    }

    public void setProductUseAddress(String productUseAddress) {
        this.productUseAddress = productUseAddress == null ? null : productUseAddress.trim();
    }

    public Double getGiveGoldPercent() {
        return giveGoldPercent;
    }

    public void setGiveGoldPercent(Double giveGoldPercent) {
        this.giveGoldPercent = giveGoldPercent;
    }

    public Double getShopDeduPercent() {
        return shopDeduPercent;
    }

    public void setShopDeduPercent(Double shopDeduPercent) {
        this.shopDeduPercent = shopDeduPercent;
    }

    public Double getPromotionAwardPercent() {
        return promotionAwardPercent;
    }

    public void setPromotionAwardPercent(Double promotionAwardPercent) {
        this.promotionAwardPercent = promotionAwardPercent;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum == null ? null : saleNum.trim();
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent == null ? null : productContent.trim();
    }

    public String getBuysNotes() {
        return buysNotes;
    }

    public void setBuysNotes(String buysNotes) {
        this.buysNotes = buysNotes == null ? null : buysNotes.trim();
    }
}