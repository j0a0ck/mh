package com.pgyer.dao;

import com.pgyer.entity.ProductPhoto;
import com.pgyer.entity.ProductPhotoExample;
import java.util.List;

public interface ProductPhotoMapper {
    int deleteByPrimaryKey(Integer photoId);

    int insert(ProductPhoto record);

    int insertSelective(ProductPhoto record);

    List<ProductPhoto> selectByExample(ProductPhotoExample example);

    ProductPhoto selectByPrimaryKey(Integer photoId);

    int updateByPrimaryKeySelective(ProductPhoto record);

    int updateByPrimaryKey(ProductPhoto record);
}