package com.pgyer.entity;

import java.io.Serializable;
import java.util.Date;

public class GoldDetails implements Serializable {
    private Integer goldDetailId;

    private Date createTime;

    private String type;

    private Double goldMoney;

    private String content;

    private String goldId;

    private String rechargeAmount;

    private static final long serialVersionUID = 1L;

    public Integer getGoldDetailId() {
        return goldDetailId;
    }

    public void setGoldDetailId(Integer goldDetailId) {
        this.goldDetailId = goldDetailId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getGoldMoney() {
        return goldMoney;
    }

    public void setGoldMoney(Double goldMoney) {
        this.goldMoney = goldMoney;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getGoldId() {
        return goldId;
    }

    public void setGoldId(String goldId) {
        this.goldId = goldId == null ? null : goldId.trim();
    }

    public String getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(String rechargeAmount) {
        this.rechargeAmount = rechargeAmount == null ? null : rechargeAmount.trim();
    }
}