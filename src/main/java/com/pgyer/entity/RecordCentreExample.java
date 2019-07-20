package com.pgyer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordCentreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordCentreExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverIsNull() {
            addCriterion("daily_turnover is null");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverIsNotNull() {
            addCriterion("daily_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverEqualTo(String value) {
            addCriterion("daily_turnover =", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverNotEqualTo(String value) {
            addCriterion("daily_turnover <>", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverGreaterThan(String value) {
            addCriterion("daily_turnover >", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("daily_turnover >=", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverLessThan(String value) {
            addCriterion("daily_turnover <", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverLessThanOrEqualTo(String value) {
            addCriterion("daily_turnover <=", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverLike(String value) {
            addCriterion("daily_turnover like", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverNotLike(String value) {
            addCriterion("daily_turnover not like", value, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverIn(List<String> values) {
            addCriterion("daily_turnover in", values, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverNotIn(List<String> values) {
            addCriterion("daily_turnover not in", values, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverBetween(String value1, String value2) {
            addCriterion("daily_turnover between", value1, value2, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyTurnoverNotBetween(String value1, String value2) {
            addCriterion("daily_turnover not between", value1, value2, "dailyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersIsNull() {
            addCriterion("daily_orders is null");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersIsNotNull() {
            addCriterion("daily_orders is not null");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersEqualTo(String value) {
            addCriterion("daily_orders =", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersNotEqualTo(String value) {
            addCriterion("daily_orders <>", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersGreaterThan(String value) {
            addCriterion("daily_orders >", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersGreaterThanOrEqualTo(String value) {
            addCriterion("daily_orders >=", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersLessThan(String value) {
            addCriterion("daily_orders <", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersLessThanOrEqualTo(String value) {
            addCriterion("daily_orders <=", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersLike(String value) {
            addCriterion("daily_orders like", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersNotLike(String value) {
            addCriterion("daily_orders not like", value, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersIn(List<String> values) {
            addCriterion("daily_orders in", values, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersNotIn(List<String> values) {
            addCriterion("daily_orders not in", values, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersBetween(String value1, String value2) {
            addCriterion("daily_orders between", value1, value2, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andDailyOrdersNotBetween(String value1, String value2) {
            addCriterion("daily_orders not between", value1, value2, "dailyOrders");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverIsNull() {
            addCriterion("monthly_turnover is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverIsNotNull() {
            addCriterion("monthly_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverEqualTo(String value) {
            addCriterion("monthly_turnover =", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverNotEqualTo(String value) {
            addCriterion("monthly_turnover <>", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverGreaterThan(String value) {
            addCriterion("monthly_turnover >", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("monthly_turnover >=", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverLessThan(String value) {
            addCriterion("monthly_turnover <", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverLessThanOrEqualTo(String value) {
            addCriterion("monthly_turnover <=", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverLike(String value) {
            addCriterion("monthly_turnover like", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverNotLike(String value) {
            addCriterion("monthly_turnover not like", value, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverIn(List<String> values) {
            addCriterion("monthly_turnover in", values, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverNotIn(List<String> values) {
            addCriterion("monthly_turnover not in", values, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverBetween(String value1, String value2) {
            addCriterion("monthly_turnover between", value1, value2, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andMonthlyTurnoverNotBetween(String value1, String value2) {
            addCriterion("monthly_turnover not between", value1, value2, "monthlyTurnover");
            return (Criteria) this;
        }

        public Criteria andDailyFlowIsNull() {
            addCriterion("daily_flow is null");
            return (Criteria) this;
        }

        public Criteria andDailyFlowIsNotNull() {
            addCriterion("daily_flow is not null");
            return (Criteria) this;
        }

        public Criteria andDailyFlowEqualTo(String value) {
            addCriterion("daily_flow =", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowNotEqualTo(String value) {
            addCriterion("daily_flow <>", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowGreaterThan(String value) {
            addCriterion("daily_flow >", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowGreaterThanOrEqualTo(String value) {
            addCriterion("daily_flow >=", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowLessThan(String value) {
            addCriterion("daily_flow <", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowLessThanOrEqualTo(String value) {
            addCriterion("daily_flow <=", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowLike(String value) {
            addCriterion("daily_flow like", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowNotLike(String value) {
            addCriterion("daily_flow not like", value, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowIn(List<String> values) {
            addCriterion("daily_flow in", values, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowNotIn(List<String> values) {
            addCriterion("daily_flow not in", values, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowBetween(String value1, String value2) {
            addCriterion("daily_flow between", value1, value2, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andDailyFlowNotBetween(String value1, String value2) {
            addCriterion("daily_flow not between", value1, value2, "dailyFlow");
            return (Criteria) this;
        }

        public Criteria andShopFansIsNull() {
            addCriterion("shop_fans is null");
            return (Criteria) this;
        }

        public Criteria andShopFansIsNotNull() {
            addCriterion("shop_fans is not null");
            return (Criteria) this;
        }

        public Criteria andShopFansEqualTo(String value) {
            addCriterion("shop_fans =", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansNotEqualTo(String value) {
            addCriterion("shop_fans <>", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansGreaterThan(String value) {
            addCriterion("shop_fans >", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansGreaterThanOrEqualTo(String value) {
            addCriterion("shop_fans >=", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansLessThan(String value) {
            addCriterion("shop_fans <", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansLessThanOrEqualTo(String value) {
            addCriterion("shop_fans <=", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansLike(String value) {
            addCriterion("shop_fans like", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansNotLike(String value) {
            addCriterion("shop_fans not like", value, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansIn(List<String> values) {
            addCriterion("shop_fans in", values, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansNotIn(List<String> values) {
            addCriterion("shop_fans not in", values, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansBetween(String value1, String value2) {
            addCriterion("shop_fans between", value1, value2, "shopFans");
            return (Criteria) this;
        }

        public Criteria andShopFansNotBetween(String value1, String value2) {
            addCriterion("shop_fans not between", value1, value2, "shopFans");
            return (Criteria) this;
        }

        public Criteria andDealShareIsNull() {
            addCriterion("deal_share is null");
            return (Criteria) this;
        }

        public Criteria andDealShareIsNotNull() {
            addCriterion("deal_share is not null");
            return (Criteria) this;
        }

        public Criteria andDealShareEqualTo(String value) {
            addCriterion("deal_share =", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareNotEqualTo(String value) {
            addCriterion("deal_share <>", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareGreaterThan(String value) {
            addCriterion("deal_share >", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareGreaterThanOrEqualTo(String value) {
            addCriterion("deal_share >=", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareLessThan(String value) {
            addCriterion("deal_share <", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareLessThanOrEqualTo(String value) {
            addCriterion("deal_share <=", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareLike(String value) {
            addCriterion("deal_share like", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareNotLike(String value) {
            addCriterion("deal_share not like", value, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareIn(List<String> values) {
            addCriterion("deal_share in", values, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareNotIn(List<String> values) {
            addCriterion("deal_share not in", values, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareBetween(String value1, String value2) {
            addCriterion("deal_share between", value1, value2, "dealShare");
            return (Criteria) this;
        }

        public Criteria andDealShareNotBetween(String value1, String value2) {
            addCriterion("deal_share not between", value1, value2, "dealShare");
            return (Criteria) this;
        }

        public Criteria andPayCommissionIsNull() {
            addCriterion("pay_commission is null");
            return (Criteria) this;
        }

        public Criteria andPayCommissionIsNotNull() {
            addCriterion("pay_commission is not null");
            return (Criteria) this;
        }

        public Criteria andPayCommissionEqualTo(String value) {
            addCriterion("pay_commission =", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionNotEqualTo(String value) {
            addCriterion("pay_commission <>", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionGreaterThan(String value) {
            addCriterion("pay_commission >", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionGreaterThanOrEqualTo(String value) {
            addCriterion("pay_commission >=", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionLessThan(String value) {
            addCriterion("pay_commission <", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionLessThanOrEqualTo(String value) {
            addCriterion("pay_commission <=", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionLike(String value) {
            addCriterion("pay_commission like", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionNotLike(String value) {
            addCriterion("pay_commission not like", value, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionIn(List<String> values) {
            addCriterion("pay_commission in", values, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionNotIn(List<String> values) {
            addCriterion("pay_commission not in", values, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionBetween(String value1, String value2) {
            addCriterion("pay_commission between", value1, value2, "payCommission");
            return (Criteria) this;
        }

        public Criteria andPayCommissionNotBetween(String value1, String value2) {
            addCriterion("pay_commission not between", value1, value2, "payCommission");
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