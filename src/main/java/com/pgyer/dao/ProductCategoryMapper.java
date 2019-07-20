package com.pgyer.dao;

import com.pgyer.entity.ProductCategory;
import com.pgyer.entity.ProductCategoryExample;
import java.util.List;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer productCategoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    List<ProductCategory> selectByExample(ProductCategoryExample example);

    ProductCategory selectByPrimaryKey(Integer productCategoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}