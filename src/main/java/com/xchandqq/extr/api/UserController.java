/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.api;

import com.xchandqq.extr.model.Account;
import com.xchandqq.extr.model.User;
import com.xchandqq.extr.service.AccountService;
import com.xchandqq.extr.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Christian
 */
@RequestMapping("api")
@RestController
public class UserController {
    
    @Autowired
    public UserService userService;
    
    @Autowired
    public AccountService accountService;
    
    @GetMapping("v1/{username}")
    public Object getUser(@PathVariable("username") String username){
        Optional<User> user = userService.getUserByUsername(username);
        if(user.isPresent()){
            return user.get();
        }
        else{
            return "Username not found";
        }
    }
    
    @GetMapping("v1/{username}/list")
    public Object getAccounts(@PathVariable("username") String username){
        Optional<User> user = userService.getUserByUsername(username);        
        if(user.isPresent()) return accountService.getAccounts(user.get());
        else return "Username not found";
    }
    
    @GetMapping("v1/{username}/{accId}")
    public Object getAccountById(
            @PathVariable("username") String username,
            @PathVariable("accId") int accId){
        Optional<User> user = userService.getUserByUsername(username);        
        if(user.isPresent()){
            Optional<Account> acc = accountService.getAccountById(accId, user.get());
            if(acc.isPresent()) return acc.get();
            else return "Account not found";
        }
        else return "Username not found";
    }
    
    @PostMapping("v1/addUser")
    public void addUser(@RequestBody User user){
        userService.createUser(user);
    }
    
    @PostMapping("v1/{username}/addAccount")
    public Object addAccount(@RequestBody Account account, @PathVariable("username") String username){
        Optional<User> user = userService.getUserByUsername(username);
        if(user.isPresent()) return accountService.createAccount(account, user.get());
        else return "Username not found";
    }
}
