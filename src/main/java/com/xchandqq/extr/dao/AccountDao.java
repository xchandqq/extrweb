/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.dao;

import com.xchandqq.extr.model.Account;
import com.xchandqq.extr.model.User;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Christian
 */
public interface AccountDao {
    int insertAccount(Account account, User owner);
    
    List<Account> selectAccounts(User owner);
    Optional<Account> selectAccountById(int accId, User owner);
    
    int updateAccount(Account account, User owner);
    int deleteAccountById(int accId, User owner);
}
