package com.pgyer.entity;

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable {
    private Integer shopId;

    private String shopName;

    private String shopAddress;

    private String shopPhone;

    private Date shopWorkingTime;

    private String shopConsumerProtection;

    private String accountId;

    private Integer shopStatus;

    private String shopPaymentWay;

    private String shopCode;

    private String shopCategoryId;

    private static final long serialVersionUID = 1L;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone == null ? null : shopPhone.trim();
    }

    public Date getShopWorkingTime() {
        return shopWorkingTime;
    }

    public void setShopWorkingTime(Date shopWorkingTime) {
        this.shopWorkingTime = shopWorkingTime;
    }

    public String getShopConsumerProtection() {
        return shopConsumerProtection;
    }

    public void setShopConsumerProtection(String shopConsumerProtection) {
        this.shopConsumerProtection = shopConsumerProtection == null ? null : shopConsumerProtection.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getShopPaymentWay() {
        return shopPaymentWay;
    }

    public void setShopPaymentWay(String shopPaymentWay) {
        this.shopPaymentWay = shopPaymentWay == null ? null : shopPaymentWay.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public String getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(String shopCategoryId) {
        this.shopCategoryId = shopCategoryId == null ? null : shopCategoryId.trim();
    }
}