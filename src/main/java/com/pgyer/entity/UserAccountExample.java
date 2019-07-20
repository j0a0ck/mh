package com.pgyer.entity;

import java.util.ArrayList;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIsNull() {
            addCriterion("account_money is null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIsNotNull() {
            addCriterion("account_money is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyEqualTo(String value) {
            addCriterion("account_money =", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotEqualTo(String value) {
            addCriterion("account_money <>", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThan(String value) {
            addCriterion("account_money >", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("account_money >=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThan(String value) {
            addCriterion("account_money <", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThanOrEqualTo(String value) {
            addCriterion("account_money <=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLike(String value) {
            addCriterion("account_money like", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotLike(String value) {
            addCriterion("account_money not like", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIn(List<String> values) {
            addCriterion("account_money in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotIn(List<String> values) {
            addCriterion("account_money not in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyBetween(String value1, String value2) {
            addCriterion("account_money between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotBetween(String value1, String value2) {
            addCriterion("account_money not between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountGoldIsNull() {
            addCriterion("account_gold is null");
            return (Criteria) this;
        }

        public Criteria andAccountGoldIsNotNull() {
            addCriterion("account_gold is not null");
            return (Criteria) this;
        }

        public Criteria andAccountGoldEqualTo(String value) {
            addCriterion("account_gold =", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldNotEqualTo(String value) {
            addCriterion("account_gold <>", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldGreaterThan(String value) {
            addCriterion("account_gold >", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldGreaterThanOrEqualTo(String value) {
            addCriterion("account_gold >=", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldLessThan(String value) {
            addCriterion("account_gold <", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldLessThanOrEqualTo(String value) {
            addCriterion("account_gold <=", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldLike(String value) {
            addCriterion("account_gold like", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldNotLike(String value) {
            addCriterion("account_gold not like", value, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldIn(List<String> values) {
            addCriterion("account_gold in", values, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldNotIn(List<String> values) {
            addCriterion("account_gold not in", values, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldBetween(String value1, String value2) {
            addCriterion("account_gold between", value1, value2, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountGoldNotBetween(String value1, String value2) {
            addCriterion("account_gold not between", value1, value2, "accountGold");
            return (Criteria) this;
        }

        public Criteria andAccountDepositIsNull() {
            addCriterion("account_deposit is null");
            return (Criteria) this;
        }

        public Criteria andAccountDepositIsNotNull() {
            addCriterion("account_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDepositEqualTo(String value) {
            addCriterion("account_deposit =", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositNotEqualTo(String value) {
            addCriterion("account_deposit <>", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositGreaterThan(String value) {
            addCriterion("account_deposit >", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositGreaterThanOrEqualTo(String value) {
            addCriterion("account_deposit >=", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositLessThan(String value) {
            addCriterion("account_deposit <", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositLessThanOrEqualTo(String value) {
            addCriterion("account_deposit <=", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositLike(String value) {
            addCriterion("account_deposit like", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositNotLike(String value) {
            addCriterion("account_deposit not like", value, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositIn(List<String> values) {
            addCriterion("account_deposit in", values, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositNotIn(List<String> values) {
            addCriterion("account_deposit not in", values, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositBetween(String value1, String value2) {
            addCriterion("account_deposit between", value1, value2, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountDepositNotBetween(String value1, String value2) {
            addCriterion("account_deposit not between", value1, value2, "accountDeposit");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}