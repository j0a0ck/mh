package com.pgyer.dao;

import com.pgyer.entity.ShopIdInformation;
import com.pgyer.entity.ShopIdInformationExample;
import java.util.List;

public interface ShopIdInformationMapper {
    int deleteByPrimaryKey(Integer businessId);

    int insert(ShopIdInformation record);

    int insertSelective(ShopIdInformation record);

    List<ShopIdInformation> selectByExample(ShopIdInformationExample example);

    ShopIdInformation selectByPrimaryKey(Integer businessId);

    int updateByPrimaryKeySelective(ShopIdInformation record);

    int updateByPrimaryKey(ShopIdInformation record);
}