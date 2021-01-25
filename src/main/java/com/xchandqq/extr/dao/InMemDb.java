/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.dao;

import com.xchandqq.extr.model.Account;
import com.xchandqq.extr.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Christian
 */
@Repository
public class InMemDb implements UserDao, AccountDao{
    
    List<User> userList = new ArrayList();
    List<Account> accountList = new ArrayList();

    @Override
    public int insertUser(UUID id, User user) {
        userList.add(new User(id, user));
        return 1;
    }

    @Override
    public List<User> selectUsers() {
        return userList;
    }

    @Override
    public Optional<User> selectUserByUsername(String username) {
        return userList
                .stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int insertAccount(Account account, User owner) {
        account.setAccId(accountList.size());
        account.setOwner(owner);
        accountList.add(account);
        return 1;
    }

    @Override
    public List<Account> selectAccounts(User owner) {
        return accountList;
    }

    @Override
    public Optional<Account> selectAccountById(int accId, User owner) {
        return accountList
                .stream()
                .filter(account -> account.getAccId() == accId)
                .findFirst();
    }

    @Override
    public int updateAccount(Account account, User owner) {
        return 0;
    }

    @Override
    public int deleteAccountById(int accId, User owner) {
        return 0;
    }
    
}
