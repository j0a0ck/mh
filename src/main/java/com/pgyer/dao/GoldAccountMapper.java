package com.pgyer.dao;

import com.pgyer.entity.GoldAccount;
import com.pgyer.entity.GoldAccountExample;
import java.util.List;

public interface GoldAccountMapper {
    int deleteByPrimaryKey(Integer goldId);

    int insert(GoldAccount record);

    int insertSelective(GoldAccount record);

    List<GoldAccount> selectByExample(GoldAccountExample example);

    GoldAccount selectByPrimaryKey(Integer goldId);

    int updateByPrimaryKeySelective(GoldAccount record);

    int updateByPrimaryKey(GoldAccount record);
}