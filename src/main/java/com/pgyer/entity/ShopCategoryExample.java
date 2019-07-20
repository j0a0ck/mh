package com.pgyer.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCategoryExample() {
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

        public Criteria andShopCategoryIdIsNull() {
            addCriterion("shop_category_id is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIsNotNull() {
            addCriterion("shop_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdEqualTo(Integer value) {
            addCriterion("shop_category_id =", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotEqualTo(Integer value) {
            addCriterion("shop_category_id <>", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThan(Integer value) {
            addCriterion("shop_category_id >", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_category_id >=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThan(Integer value) {
            addCriterion("shop_category_id <", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_category_id <=", value, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdIn(List<Integer> values) {
            addCriterion("shop_category_id in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotIn(List<Integer> values) {
            addCriterion("shop_category_id not in", values, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_id between", value1, value2, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_id not between", value1, value2, "shopCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIsNull() {
            addCriterion("shop_category_name is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIsNotNull() {
            addCriterion("shop_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameEqualTo(String value) {
            addCriterion("shop_category_name =", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotEqualTo(String value) {
            addCriterion("shop_category_name <>", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameGreaterThan(String value) {
            addCriterion("shop_category_name >", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_category_name >=", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLessThan(String value) {
            addCriterion("shop_category_name <", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("shop_category_name <=", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLike(String value) {
            addCriterion("shop_category_name like", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotLike(String value) {
            addCriterion("shop_category_name not like", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIn(List<String> values) {
            addCriterion("shop_category_name in", values, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotIn(List<String> values) {
            addCriterion("shop_category_name not in", values, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameBetween(String value1, String value2) {
            addCriterion("shop_category_name between", value1, value2, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotBetween(String value1, String value2) {
            addCriterion("shop_category_name not between", value1, value2, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperIsNull() {
            addCriterion("shop_category_upper is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperIsNotNull() {
            addCriterion("shop_category_upper is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperEqualTo(String value) {
            addCriterion("shop_category_upper =", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperNotEqualTo(String value) {
            addCriterion("shop_category_upper <>", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperGreaterThan(String value) {
            addCriterion("shop_category_upper >", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperGreaterThanOrEqualTo(String value) {
            addCriterion("shop_category_upper >=", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperLessThan(String value) {
            addCriterion("shop_category_upper <", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperLessThanOrEqualTo(String value) {
            addCriterion("shop_category_upper <=", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperLike(String value) {
            addCriterion("shop_category_upper like", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperNotLike(String value) {
            addCriterion("shop_category_upper not like", value, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperIn(List<String> values) {
            addCriterion("shop_category_upper in", values, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperNotIn(List<String> values) {
            addCriterion("shop_category_upper not in", values, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperBetween(String value1, String value2) {
            addCriterion("shop_category_upper between", value1, value2, "shopCategoryUpper");
            return (Criteria) this;
        }

        public Criteria andShopCategoryUpperNotBetween(String value1, String value2) {
            addCriterion("shop_category_upper not between", value1, value2, "shopCategoryUpper");
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