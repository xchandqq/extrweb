/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 *
 * @author Christian
 */
public class Account {
    private int accId;
    private String accName;
    private boolean isAsset;
    private User owner;

    public Account(
            @JsonProperty("accId") int id, 
            @JsonProperty("accName") String name, 
            @JsonProperty("isAsset") boolean assetAccount) {
        this.accId = id;
        this.accName = name;
        this.isAsset = assetAccount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccId(), getAccName(), isIsAsset(), getOwner());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return false;
        else if(obj == null || getClass() != obj.getClass()) return false;
        else{
            Account acc = (Account) obj;
            return 
                    acc.getAccId() == getAccId() &&
                    acc.getAccName().equals(getAccName()) &&
                    acc.isIsAsset() == isIsAsset() &&
                    acc.getOwner().equals(getOwner());                    
        }
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public boolean isIsAsset() {
        return isAsset;
    }

    public void setIsAsset(boolean isAsset) {
        this.isAsset = isAsset;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
    
    
    
}
