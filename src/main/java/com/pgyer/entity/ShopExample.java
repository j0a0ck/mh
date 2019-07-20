package com.pgyer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(String value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(String value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(String value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(String value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLike(String value) {
            addCriterion("shop_phone like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotLike(String value) {
            addCriterion("shop_phone not like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<String> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<String> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(String value1, String value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeIsNull() {
            addCriterion("shop_working_time is null");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeIsNotNull() {
            addCriterion("shop_working_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeEqualTo(Date value) {
            addCriterionForJDBCDate("shop_working_time =", value, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("shop_working_time <>", value, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("shop_working_time >", value, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_working_time >=", value, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeLessThan(Date value) {
            addCriterionForJDBCDate("shop_working_time <", value, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_working_time <=", value, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeIn(List<Date> values) {
            addCriterionForJDBCDate("shop_working_time in", values, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("shop_working_time not in", values, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_working_time between", value1, value2, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopWorkingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_working_time not between", value1, value2, "shopWorkingTime");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionIsNull() {
            addCriterion("shop_consumer_protection is null");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionIsNotNull() {
            addCriterion("shop_consumer_protection is not null");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionEqualTo(String value) {
            addCriterion("shop_consumer_protection =", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionNotEqualTo(String value) {
            addCriterion("shop_consumer_protection <>", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionGreaterThan(String value) {
            addCriterion("shop_consumer_protection >", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("shop_consumer_protection >=", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionLessThan(String value) {
            addCriterion("shop_consumer_protection <", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionLessThanOrEqualTo(String value) {
            addCriterion("shop_consumer_protection <=", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionLike(String value) {
            addCriterion("shop_consumer_protection like", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionNotLike(String value) {
            addCriterion("shop_consumer_protection not like", value, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionIn(List<String> values) {
            addCriterion("shop_consumer_protection in", values, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionNotIn(List<String> values) {
            addCriterion("shop_consumer_protection not in", values, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionBetween(String value1, String value2) {
            addCriterion("shop_consumer_protection between", value1, value2, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andShopConsumerProtectionNotBetween(String value1, String value2) {
            addCriterion("shop_consumer_protection not between", value1, value2, "shopConsumerProtection");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNull() {
            addCriterion("shop_status is null");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNotNull() {
            addCriterion("shop_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopStatusEqualTo(Integer value) {
            addCriterion("shop_status =", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotEqualTo(Integer value) {
            addCriterion("shop_status <>", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThan(Integer value) {
            addCriterion("shop_status >", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_status >=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThan(Integer value) {
            addCriterion("shop_status <", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shop_status <=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusIn(List<Integer> values) {
            addCriterion("shop_status in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotIn(List<Integer> values) {
            addCriterion("shop_status not in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusBetween(Integer value1, Integer value2) {
            addCriterion("shop_status between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_status not between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayIsNull() {
            addCriterion("shop_payment_way is null");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayIsNotNull() {
            addCriterion("shop_payment_way is not null");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayEqualTo(String value) {
            addCriterion("shop_payment_way =", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayNotEqualTo(String value) {
            addCriterion("shop_payment_way <>", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayGreaterThan(String value) {
            addCriterion("shop_payment_way >", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayGreaterThanOrEqualTo(String value) {
            addCriterion("shop_payment_way >=", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayLessThan(String value) {
            addCriterion("shop_payment_way <", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayLessThanOrEqualTo(String value) {
            addCriterion("shop_payment_way <=", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayLike(String value) {
            addCriterion("shop_payment_way like", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayNotLike(String value) {
            addCriterion("shop_payment_way not like", value, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayIn(List<String> values) {
            addCriterion("shop_payment_way in", values, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayNotIn(List<String> values) {
            addCriterion("shop_payment_way not in", values, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayBetween(String value1, String value2) {
            addCriterion("shop_payment_way between", value1, value2, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopPaymentWayNotBetween(String value1, String value2) {
            addCriterion("shop_payment_way not between", value1, value2, "shopPaymentWay");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(String value) {
            addCriterion("shop_code =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(String value) {
            addCriterion("shop_code <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(String value) {
            addCriterion("shop_code >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_code >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(String value) {
            addCriterion("shop_code <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(String value) {
            addCriterion("shop_code <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLike(String value) {
            addCriterion("shop_code like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotLike(String value) {
            addCriterion("shop_code not like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<String> values) {
            addCriterion("shop_code in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<String> values) {
            addCriterion("shop_code not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(String value1, String value2) {
            addCriterion("shop_code between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(String value1, String value2) {
            addCriterion("shop_code not between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIsNull() {
            addCriterion("shop_category_id is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIsNotNull() {
            addCriterion("shop_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdEqualTo(String value) {
            addCriterion("shop_category_id =", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotEqualTo(String value) {
            addCriterion("shop_category_id <>", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThan(String value) {
            addCriterion("shop_category_id >", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_category_id >=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThan(String value) {
            addCriterion("shop_category_id <", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("shop_category_id <=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLike(String value) {
            addCriterion("shop_category_id like", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotLike(String value) {
            addCriterion("shop_category_id not like", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIn(List<String> values) {
            addCriterion("shop_category_id in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotIn(List<String> values) {
            addCriterion("shop_category_id not in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdBetween(String value1, String value2) {
            addCriterion("shop_category_id between", value1, value2, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotBetween(String value1, String value2) {
            addCriterion("shop_category_id not between", value1, value2, "shopCategoryId");
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