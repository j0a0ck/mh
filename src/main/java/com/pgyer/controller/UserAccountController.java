package com.pgyer.controller;

import com.pgyer.entity.UserAccount;
import com.pgyer.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/UserAccount")
public class UserAccountController {
    @Autowired
    private UserAccountService UserAccountService;

    @PostMapping("insert")
    public void insert(UserAccount UserAccount){
        UserAccountService.insert(UserAccount);
    }

    @GetMapping("/get")
    public UserAccount get(Integer id){
        return UserAccountService.get(id);
    }
}
