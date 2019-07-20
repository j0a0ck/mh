package com.pgyer.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(String value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(String value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(String value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(String value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(String value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(String value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLike(String value) {
            addCriterion("product_price like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotLike(String value) {
            addCriterion("product_price not like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<String> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<String> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(String value1, String value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(String value1, String value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberIsNull() {
            addCriterion("restriction_number is null");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberIsNotNull() {
            addCriterion("restriction_number is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberEqualTo(Integer value) {
            addCriterion("restriction_number =", value, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberNotEqualTo(Integer value) {
            addCriterion("restriction_number <>", value, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberGreaterThan(Integer value) {
            addCriterion("restriction_number >", value, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("restriction_number >=", value, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberLessThan(Integer value) {
            addCriterion("restriction_number <", value, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("restriction_number <=", value, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberIn(List<Integer> values) {
            addCriterion("restriction_number in", values, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberNotIn(List<Integer> values) {
            addCriterion("restriction_number not in", values, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberBetween(Integer value1, Integer value2) {
            addCriterion("restriction_number between", value1, value2, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andRestrictionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("restriction_number not between", value1, value2, "restrictionNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(String value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(String value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(String value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(String value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLike(String value) {
            addCriterion("product_category_id like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotLike(String value) {
            addCriterion("product_category_id not like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<String> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<String> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(String value1, String value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(String value1, String value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressIsNull() {
            addCriterion("product_use_address is null");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressIsNotNull() {
            addCriterion("product_use_address is not null");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressEqualTo(String value) {
            addCriterion("product_use_address =", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressNotEqualTo(String value) {
            addCriterion("product_use_address <>", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressGreaterThan(String value) {
            addCriterion("product_use_address >", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("product_use_address >=", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressLessThan(String value) {
            addCriterion("product_use_address <", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressLessThanOrEqualTo(String value) {
            addCriterion("product_use_address <=", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressLike(String value) {
            addCriterion("product_use_address like", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressNotLike(String value) {
            addCriterion("product_use_address not like", value, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressIn(List<String> values) {
            addCriterion("product_use_address in", values, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressNotIn(List<String> values) {
            addCriterion("product_use_address not in", values, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressBetween(String value1, String value2) {
            addCriterion("product_use_address between", value1, value2, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andProductUseAddressNotBetween(String value1, String value2) {
            addCriterion("product_use_address not between", value1, value2, "productUseAddress");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentIsNull() {
            addCriterion("give_gold_percent is null");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentIsNotNull() {
            addCriterion("give_gold_percent is not null");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentEqualTo(Double value) {
            addCriterion("give_gold_percent =", value, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentNotEqualTo(Double value) {
            addCriterion("give_gold_percent <>", value, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentGreaterThan(Double value) {
            addCriterion("give_gold_percent >", value, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("give_gold_percent >=", value, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentLessThan(Double value) {
            addCriterion("give_gold_percent <", value, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentLessThanOrEqualTo(Double value) {
            addCriterion("give_gold_percent <=", value, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentIn(List<Double> values) {
            addCriterion("give_gold_percent in", values, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentNotIn(List<Double> values) {
            addCriterion("give_gold_percent not in", values, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentBetween(Double value1, Double value2) {
            addCriterion("give_gold_percent between", value1, value2, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andGiveGoldPercentNotBetween(Double value1, Double value2) {
            addCriterion("give_gold_percent not between", value1, value2, "giveGoldPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentIsNull() {
            addCriterion("shop_dedu_percent is null");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentIsNotNull() {
            addCriterion("shop_dedu_percent is not null");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentEqualTo(Double value) {
            addCriterion("shop_dedu_percent =", value, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentNotEqualTo(Double value) {
            addCriterion("shop_dedu_percent <>", value, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentGreaterThan(Double value) {
            addCriterion("shop_dedu_percent >", value, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_dedu_percent >=", value, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentLessThan(Double value) {
            addCriterion("shop_dedu_percent <", value, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentLessThanOrEqualTo(Double value) {
            addCriterion("shop_dedu_percent <=", value, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentIn(List<Double> values) {
            addCriterion("shop_dedu_percent in", values, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentNotIn(List<Double> values) {
            addCriterion("shop_dedu_percent not in", values, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentBetween(Double value1, Double value2) {
            addCriterion("shop_dedu_percent between", value1, value2, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andShopDeduPercentNotBetween(Double value1, Double value2) {
            addCriterion("shop_dedu_percent not between", value1, value2, "shopDeduPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentIsNull() {
            addCriterion("promotion_award_percent is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentIsNotNull() {
            addCriterion("promotion_award_percent is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentEqualTo(Double value) {
            addCriterion("promotion_award_percent =", value, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentNotEqualTo(Double value) {
            addCriterion("promotion_award_percent <>", value, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentGreaterThan(Double value) {
            addCriterion("promotion_award_percent >", value, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("promotion_award_percent >=", value, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentLessThan(Double value) {
            addCriterion("promotion_award_percent <", value, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentLessThanOrEqualTo(Double value) {
            addCriterion("promotion_award_percent <=", value, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentIn(List<Double> values) {
            addCriterion("promotion_award_percent in", values, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentNotIn(List<Double> values) {
            addCriterion("promotion_award_percent not in", values, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentBetween(Double value1, Double value2) {
            addCriterion("promotion_award_percent between", value1, value2, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardPercentNotBetween(Double value1, Double value2) {
            addCriterion("promotion_award_percent not between", value1, value2, "promotionAwardPercent");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(Integer value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Integer value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Integer value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Integer value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Integer value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Integer> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Integer> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Integer value1, Integer value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
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

        public Criteria andSaleNumIsNull() {
            addCriterion("sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(String value) {
            addCriterion("sale_num =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(String value) {
            addCriterion("sale_num <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(String value) {
            addCriterion("sale_num >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(String value) {
            addCriterion("sale_num >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(String value) {
            addCriterion("sale_num <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(String value) {
            addCriterion("sale_num <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLike(String value) {
            addCriterion("sale_num like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotLike(String value) {
            addCriterion("sale_num not like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<String> values) {
            addCriterion("sale_num in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<String> values) {
            addCriterion("sale_num not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(String value1, String value2) {
            addCriterion("sale_num between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(String value1, String value2) {
            addCriterion("sale_num not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andProductContentIsNull() {
            addCriterion("product_content is null");
            return (Criteria) this;
        }

        public Criteria andProductContentIsNotNull() {
            addCriterion("product_content is not null");
            return (Criteria) this;
        }

        public Criteria andProductContentEqualTo(String value) {
            addCriterion("product_content =", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentNotEqualTo(String value) {
            addCriterion("product_content <>", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentGreaterThan(String value) {
            addCriterion("product_content >", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentGreaterThanOrEqualTo(String value) {
            addCriterion("product_content >=", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentLessThan(String value) {
            addCriterion("product_content <", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentLessThanOrEqualTo(String value) {
            addCriterion("product_content <=", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentLike(String value) {
            addCriterion("product_content like", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentNotLike(String value) {
            addCriterion("product_content not like", value, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentIn(List<String> values) {
            addCriterion("product_content in", values, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentNotIn(List<String> values) {
            addCriterion("product_content not in", values, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentBetween(String value1, String value2) {
            addCriterion("product_content between", value1, value2, "productContent");
            return (Criteria) this;
        }

        public Criteria andProductContentNotBetween(String value1, String value2) {
            addCriterion("product_content not between", value1, value2, "productContent");
            return (Criteria) this;
        }

        public Criteria andBuysNotesIsNull() {
            addCriterion("buys_notes is null");
            return (Criteria) this;
        }

        public Criteria andBuysNotesIsNotNull() {
            addCriterion("buys_notes is not null");
            return (Criteria) this;
        }

        public Criteria andBuysNotesEqualTo(String value) {
            addCriterion("buys_notes =", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesNotEqualTo(String value) {
            addCriterion("buys_notes <>", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesGreaterThan(String value) {
            addCriterion("buys_notes >", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesGreaterThanOrEqualTo(String value) {
            addCriterion("buys_notes >=", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesLessThan(String value) {
            addCriterion("buys_notes <", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesLessThanOrEqualTo(String value) {
            addCriterion("buys_notes <=", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesLike(String value) {
            addCriterion("buys_notes like", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesNotLike(String value) {
            addCriterion("buys_notes not like", value, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesIn(List<String> values) {
            addCriterion("buys_notes in", values, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesNotIn(List<String> values) {
            addCriterion("buys_notes not in", values, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesBetween(String value1, String value2) {
            addCriterion("buys_notes between", value1, value2, "buysNotes");
            return (Criteria) this;
        }

        public Criteria andBuysNotesNotBetween(String value1, String value2) {
            addCriterion("buys_notes not between", value1, value2, "buysNotes");
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