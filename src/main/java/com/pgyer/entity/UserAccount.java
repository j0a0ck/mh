package com.pgyer.entity;

import java.io.Serializable;

public class UserAccount implements Serializable {
    private Integer accountId;

    private String accountName;

    private String accountMoney;

    private String accountGold;

    private String accountDeposit;

    private String userId;

    private static final long serialVersionUID = 1L;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(String accountMoney) {
        this.accountMoney = accountMoney == null ? null : accountMoney.trim();
    }

    public String getAccountGold() {
        return accountGold;
    }

    public void setAccountGold(String accountGold) {
        this.accountGold = accountGold == null ? null : accountGold.trim();
    }

    public String getAccountDeposit() {
        return accountDeposit;
    }

    public void setAccountDeposit(String accountDeposit) {
        this.accountDeposit = accountDeposit == null ? null : accountDeposit.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}