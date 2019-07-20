package com.pgyer.entity;

import java.io.Serializable;
import java.util.Date;

public class RecordCentre implements Serializable {
    private Integer recordId;

    private String dailyTurnover;

    private String dailyOrders;

    private String monthlyTurnover;

    private String dailyFlow;

    private String shopFans;

    private String dealShare;

    private String payCommission;

    private Date createTime;

    private String accountId;

    private static final long serialVersionUID = 1L;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getDailyTurnover() {
        return dailyTurnover;
    }

    public void setDailyTurnover(String dailyTurnover) {
        this.dailyTurnover = dailyTurnover == null ? null : dailyTurnover.trim();
    }

    public String getDailyOrders() {
        return dailyOrders;
    }

    public void setDailyOrders(String dailyOrders) {
        this.dailyOrders = dailyOrders == null ? null : dailyOrders.trim();
    }

    public String getMonthlyTurnover() {
        return monthlyTurnover;
    }

    public void setMonthlyTurnover(String monthlyTurnover) {
        this.monthlyTurnover = monthlyTurnover == null ? null : monthlyTurnover.trim();
    }

    public String getDailyFlow() {
        return dailyFlow;
    }

    public void setDailyFlow(String dailyFlow) {
        this.dailyFlow = dailyFlow == null ? null : dailyFlow.trim();
    }

    public String getShopFans() {
        return shopFans;
    }

    public void setShopFans(String shopFans) {
        this.shopFans = shopFans == null ? null : shopFans.trim();
    }

    public String getDealShare() {
        return dealShare;
    }

    public void setDealShare(String dealShare) {
        this.dealShare = dealShare == null ? null : dealShare.trim();
    }

    public String getPayCommission() {
        return payCommission;
    }

    public void setPayCommission(String payCommission) {
        this.payCommission = payCommission == null ? null : payCommission.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }
}