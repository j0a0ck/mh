package com.pgyer.dao;

import com.pgyer.entity.ShopPhoto;
import com.pgyer.entity.ShopPhotoExample;
import java.util.List;

public interface ShopPhotoMapper {
    int deleteByPrimaryKey(Integer photoId);

    int insert(ShopPhoto record);

    int insertSelective(ShopPhoto record);

    List<ShopPhoto> selectByExample(ShopPhotoExample example);

    ShopPhoto selectByPrimaryKey(Integer photoId);

    int updateByPrimaryKeySelective(ShopPhoto record);

    int updateByPrimaryKey(ShopPhoto record);
}