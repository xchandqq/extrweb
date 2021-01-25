/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author Christian
 */
public class User {

    private UUID id;
    private String name;
    private String username;

    public User(
            @JsonProperty("uuid") UUID id,
            @JsonProperty("name") String name,
            @JsonProperty("username") String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    public User(UUID id, User user) {
        this.id = id;
        this.name = user.name;
        this.username = user.username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getUsername());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            User user = (User) obj;
            return user.getId().equals(getId())
                    && user.getName().equals(getName())
                    && user.getUsername().equals(getUsername());
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
