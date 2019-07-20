package com.pgyer.entity;

import java.io.Serializable;

public class RefundApplication implements Serializable {
    private Integer refundId;

    private String refundReason;

    private String refundMoney;

    private String refundContent;

    private Integer refundAgree;

    private String orderId;

    private static final long serialVersionUID = 1L;

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(String refundMoney) {
        this.refundMoney = refundMoney == null ? null : refundMoney.trim();
    }

    public String getRefundContent() {
        return refundContent;
    }

    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent == null ? null : refundContent.trim();
    }

    public Integer getRefundAgree() {
        return refundAgree;
    }

    public void setRefundAgree(Integer refundAgree) {
        this.refundAgree = refundAgree;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}