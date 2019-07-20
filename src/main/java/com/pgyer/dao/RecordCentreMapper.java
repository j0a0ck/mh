package com.pgyer.dao;

import com.pgyer.entity.RecordCentre;
import com.pgyer.entity.RecordCentreExample;
import java.util.List;

public interface RecordCentreMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(RecordCentre record);

    int insertSelective(RecordCentre record);

    List<RecordCentre> selectByExample(RecordCentreExample example);

    RecordCentre selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(RecordCentre record);

    int updateByPrimaryKey(RecordCentre record);
}