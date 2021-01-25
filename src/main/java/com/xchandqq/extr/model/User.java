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

    UUID id;
    String name;
    String username;

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
        return Objects.hash(id, name, username);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            User user = (User) obj;
            return user.id.equals(id)
                    && user.name.equals(name)
                    && user.username.equals(username);
        }
    }

}
