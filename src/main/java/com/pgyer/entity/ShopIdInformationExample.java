package com.pgyer.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopIdInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopIdInformationExample() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaIsNull() {
            addCriterion("business_loa is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaIsNotNull() {
            addCriterion("business_loa is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaEqualTo(String value) {
            addCriterion("business_loa =", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaNotEqualTo(String value) {
            addCriterion("business_loa <>", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaGreaterThan(String value) {
            addCriterion("business_loa >", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaGreaterThanOrEqualTo(String value) {
            addCriterion("business_loa >=", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaLessThan(String value) {
            addCriterion("business_loa <", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaLessThanOrEqualTo(String value) {
            addCriterion("business_loa <=", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaLike(String value) {
            addCriterion("business_loa like", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaNotLike(String value) {
            addCriterion("business_loa not like", value, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaIn(List<String> values) {
            addCriterion("business_loa in", values, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaNotIn(List<String> values) {
            addCriterion("business_loa not in", values, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaBetween(String value1, String value2) {
            addCriterion("business_loa between", value1, value2, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessLoaNotBetween(String value1, String value2) {
            addCriterion("business_loa not between", value1, value2, "businessLoa");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitIsNull() {
            addCriterion("business_permit is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitIsNotNull() {
            addCriterion("business_permit is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitEqualTo(String value) {
            addCriterion("business_permit =", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitNotEqualTo(String value) {
            addCriterion("business_permit <>", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitGreaterThan(String value) {
            addCriterion("business_permit >", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitGreaterThanOrEqualTo(String value) {
            addCriterion("business_permit >=", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitLessThan(String value) {
            addCriterion("business_permit <", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitLessThanOrEqualTo(String value) {
            addCriterion("business_permit <=", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitLike(String value) {
            addCriterion("business_permit like", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitNotLike(String value) {
            addCriterion("business_permit not like", value, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitIn(List<String> values) {
            addCriterion("business_permit in", values, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitNotIn(List<String> values) {
            addCriterion("business_permit not in", values, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitBetween(String value1, String value2) {
            addCriterion("business_permit between", value1, value2, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andBusinessPermitNotBetween(String value1, String value2) {
            addCriterion("business_permit not between", value1, value2, "businessPermit");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingIsNull() {
            addCriterion("other_supporting is null");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingIsNotNull() {
            addCriterion("other_supporting is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingEqualTo(String value) {
            addCriterion("other_supporting =", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingNotEqualTo(String value) {
            addCriterion("other_supporting <>", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingGreaterThan(String value) {
            addCriterion("other_supporting >", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingGreaterThanOrEqualTo(String value) {
            addCriterion("other_supporting >=", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingLessThan(String value) {
            addCriterion("other_supporting <", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingLessThanOrEqualTo(String value) {
            addCriterion("other_supporting <=", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingLike(String value) {
            addCriterion("other_supporting like", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingNotLike(String value) {
            addCriterion("other_supporting not like", value, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingIn(List<String> values) {
            addCriterion("other_supporting in", values, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingNotIn(List<String> values) {
            addCriterion("other_supporting not in", values, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingBetween(String value1, String value2) {
            addCriterion("other_supporting between", value1, value2, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andOtherSupportingNotBetween(String value1, String value2) {
            addCriterion("other_supporting not between", value1, value2, "otherSupporting");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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