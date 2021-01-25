/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchandqq.extr.model;

import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Christian
 */
public class UserTest {
    
    public UserTest() {
    }

    /**
     * Test of hashCode method, of class User.
     */
    @Test
    public void testHashCode() {
        User user1 = new User(UUID.randomUUID(), "Christian Abellanosa", "xchandqq");
        User user2 = new User(user1.getId(), "Christian Abellanosa", "xchandqq");
        User user3 = new User(user1.getId(), "Christian B. Abellanosa", "xchandqq");
        User user4 = new User(UUID.randomUUID(), "Christian Abellanosa", "xchandqq");
        Assertions.assertEquals(user1, user2);
        Assertions.assertNotEquals(user2, user3);
        Assertions.assertNotEquals(user1, user4);
    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
    }
    
}
