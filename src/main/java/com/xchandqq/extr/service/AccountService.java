/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.service;

import com.xchandqq.extr.dao.AccountDao;
import com.xchandqq.extr.dao.UserDao;
import com.xchandqq.extr.model.Account;
import com.xchandqq.extr.model.User;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */
@Service
public class AccountService {
    
    @Autowired
    public AccountDao accountDao;
    
    
    public int createAccount(Account account, User owner){
        return accountDao.insertAccount(account, owner);
    }
    
    public List<Account> getAccounts(User owner){
        return accountDao.selectAccounts(owner);
    }
    
    public Optional<Account> getAccountById(int accId, User owner){
        return accountDao.selectAccountById(accId, owner);
    }
    
    public int removeAccount(Account account, User owner){
        return accountDao.deleteAccountById(account.getAccId(), owner);
    }
    
    public int updateAccount(Account account, User user){
        return accountDao.updateAccount(account, user);
    }
    
}
