package com.pgyer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoldDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoldDetailsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andGoldDetailIdIsNull() {
            addCriterion("gold_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdIsNotNull() {
            addCriterion("gold_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdEqualTo(Integer value) {
            addCriterion("gold_detail_id =", value, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdNotEqualTo(Integer value) {
            addCriterion("gold_detail_id <>", value, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdGreaterThan(Integer value) {
            addCriterion("gold_detail_id >", value, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold_detail_id >=", value, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdLessThan(Integer value) {
            addCriterion("gold_detail_id <", value, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("gold_detail_id <=", value, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdIn(List<Integer> values) {
            addCriterion("gold_detail_id in", values, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdNotIn(List<Integer> values) {
            addCriterion("gold_detail_id not in", values, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("gold_detail_id between", value1, value2, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andGoldDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gold_detail_id not between", value1, value2, "goldDetailId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyIsNull() {
            addCriterion("gold_money is null");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyIsNotNull() {
            addCriterion("gold_money is not null");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyEqualTo(Double value) {
            addCriterion("gold_money =", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyNotEqualTo(Double value) {
            addCriterion("gold_money <>", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyGreaterThan(Double value) {
            addCriterion("gold_money >", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("gold_money >=", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyLessThan(Double value) {
            addCriterion("gold_money <", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyLessThanOrEqualTo(Double value) {
            addCriterion("gold_money <=", value, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyIn(List<Double> values) {
            addCriterion("gold_money in", values, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyNotIn(List<Double> values) {
            addCriterion("gold_money not in", values, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyBetween(Double value1, Double value2) {
            addCriterion("gold_money between", value1, value2, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andGoldMoneyNotBetween(Double value1, Double value2) {
            addCriterion("gold_money not between", value1, value2, "goldMoney");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andGoldIdIsNull() {
            addCriterion("gold_id is null");
            return (Criteria) this;
        }

        public Criteria andGoldIdIsNotNull() {
            addCriterion("gold_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoldIdEqualTo(String value) {
            addCriterion("gold_id =", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdNotEqualTo(String value) {
            addCriterion("gold_id <>", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdGreaterThan(String value) {
            addCriterion("gold_id >", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdGreaterThanOrEqualTo(String value) {
            addCriterion("gold_id >=", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdLessThan(String value) {
            addCriterion("gold_id <", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdLessThanOrEqualTo(String value) {
            addCriterion("gold_id <=", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdLike(String value) {
            addCriterion("gold_id like", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdNotLike(String value) {
            addCriterion("gold_id not like", value, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdIn(List<String> values) {
            addCriterion("gold_id in", values, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdNotIn(List<String> values) {
            addCriterion("gold_id not in", values, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdBetween(String value1, String value2) {
            addCriterion("gold_id between", value1, value2, "goldId");
            return (Criteria) this;
        }

        public Criteria andGoldIdNotBetween(String value1, String value2) {
            addCriterion("gold_id not between", value1, value2, "goldId");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(String value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(String value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(String value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(String value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(String value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLike(String value) {
            addCriterion("recharge_amount like", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotLike(String value) {
            addCriterion("recharge_amount not like", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<String> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<String> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(String value1, String value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(String value1, String value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
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