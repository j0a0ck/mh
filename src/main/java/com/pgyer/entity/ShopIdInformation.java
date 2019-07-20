package com.pgyer.entity;

import java.io.Serializable;

public class ShopIdInformation implements Serializable {
    private Integer businessId;

    private String businessLicense;

    private String businessLoa;

    private String businessPermit;

    private String otherSupporting;

    private String shopId;

    private static final long serialVersionUID = 1L;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getBusinessLoa() {
        return businessLoa;
    }

    public void setBusinessLoa(String businessLoa) {
        this.businessLoa = businessLoa == null ? null : businessLoa.trim();
    }

    public String getBusinessPermit() {
        return businessPermit;
    }

    public void setBusinessPermit(String businessPermit) {
        this.businessPermit = businessPermit == null ? null : businessPermit.trim();
    }

    public String getOtherSupporting() {
        return otherSupporting;
    }

    public void setOtherSupporting(String otherSupporting) {
        this.otherSupporting = otherSupporting == null ? null : otherSupporting.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }
}