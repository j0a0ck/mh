package com.pgyer.entity;

import java.io.Serializable;
import java.util.Date;

public class GoldAccount implements Serializable {
    private Integer goldId;

    private Date createTime;

    private Double goldTotal;

    private String accountId;

    private static final long serialVersionUID = 1L;

    public Integer getGoldId() {
        return goldId;
    }

    public void setGoldId(Integer goldId) {
        this.goldId = goldId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getGoldTotal() {
        return goldTotal;
    }

    public void setGoldTotal(Double goldTotal) {
        this.goldTotal = goldTotal;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }
}