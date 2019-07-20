package com.pgyer.service;

import com.pgyer.dao.UserAccountMapper;
import com.pgyer.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {
    @Autowired
    private UserAccountMapper UserAccountMapper;

    public void insert(UserAccount UserAccount){
        UserAccountMapper.insert(UserAccount);
    }

    public UserAccount get(Integer id){
        return UserAccountMapper.selectByPrimaryKey(id);
    }
}
