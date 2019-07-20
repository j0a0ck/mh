package com.pgyer.dao;

import com.pgyer.entity.UserAccount;
import com.pgyer.entity.UserAccountExample;
import java.util.List;

public interface UserAccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    List<UserAccount> selectByExample(UserAccountExample example);

    UserAccount selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}