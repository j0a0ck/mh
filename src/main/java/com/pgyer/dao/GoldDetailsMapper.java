package com.pgyer.dao;

import com.pgyer.entity.GoldDetails;
import com.pgyer.entity.GoldDetailsExample;
import java.util.List;

public interface GoldDetailsMapper {
    int deleteByPrimaryKey(Integer goldDetailId);

    int insert(GoldDetails record);

    int insertSelective(GoldDetails record);

    List<GoldDetails> selectByExample(GoldDetailsExample example);

    GoldDetails selectByPrimaryKey(Integer goldDetailId);

    int updateByPrimaryKeySelective(GoldDetails record);

    int updateByPrimaryKey(GoldDetails record);
}