/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.dao;

import com.xchandqq.extr.model.User;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author Christian
 */
public interface UserDao {
    int insertUser(UUID id, User user);
    default int insertUser(User user){
        return insertUser(UUID.randomUUID(), user);
    }
    
    List<User> selectUsers();
    Optional<User> selectUserByUsername(String username);
    
    int updateUser(User user);
    int deleteUserById(UUID id);
}
