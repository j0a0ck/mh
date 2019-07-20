package com.pgyer.dao;

import com.pgyer.entity.RefundApplication;
import com.pgyer.entity.RefundApplicationExample;
import java.util.List;

public interface RefundApplicationMapper {
    int deleteByPrimaryKey(Integer refundId);

    int insert(RefundApplication record);

    int insertSelective(RefundApplication record);

    List<RefundApplication> selectByExample(RefundApplicationExample example);

    RefundApplication selectByPrimaryKey(Integer refundId);

    int updateByPrimaryKeySelective(RefundApplication record);

    int updateByPrimaryKey(RefundApplication record);
}