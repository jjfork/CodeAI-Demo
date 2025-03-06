package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MongoUserEntityTests {

    private MongoUserEntity mongoUserEntity;

    @BeforeEach
    void setUp() {
        mongoUserEntity = new MongoUserEntity();
    }

    @Test
    void testConvertFrom() {
        // GIVEN a User object
        User user = new User("testName", "testEmail"); 
        // ... rest of the test case
    }

    @Test
    void testConvertTo() {
        // GIVEN a MongoUserEntity object
        mongoUserEntity.setName("testName");
        mongoUserEntity.setEmail("testEmail");
        // ... rest of the test case
    }
}


class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters for name and email
}



class MongoUserEntity {
    private String name;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ... other methods 
}