/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.service;

import com.xchandqq.extr.dao.AccountDao;
import com.xchandqq.extr.dao.UserDao;
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
public class UserService {
    
    @Autowired
    public UserDao userDao;
    
    
    public int createUser(User user){
        return userDao.insertUser(user);
    }
    
    public List<User> getUsers(){
        return userDao.selectUsers();
    }
    
    public Optional<User> getUserByUsername(String username){
        return userDao.selectUserByUsername(username);
    }
    
    public int removeUser(User user){
        return userDao.deleteUserById(user.getId());
    }
    
    public int updateUser(User user){
        return userDao.updateUser(user);
    }
    
}
