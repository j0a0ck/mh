package com.pgyer.dao;

import com.pgyer.entity.ShopCategory;
import com.pgyer.entity.ShopCategoryExample;
import java.util.List;

public interface ShopCategoryMapper {
    int deleteByPrimaryKey(Integer shopCategoryId);

    int insert(ShopCategory record);

    int insertSelective(ShopCategory record);

    List<ShopCategory> selectByExample(ShopCategoryExample example);

    ShopCategory selectByPrimaryKey(Integer shopCategoryId);

    int updateByPrimaryKeySelective(ShopCategory record);

    int updateByPrimaryKey(ShopCategory record);
}