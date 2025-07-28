package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.bestpractice.api.infrastrucuture.entity.User; 
import org.bson.types.ObjectId;

public class MongoUserEntityGeneratedAiTests {

    private MongoUserEntity mongoUserEntity;

    @BeforeEach
    void setUp() {
        mongoUserEntity = new MongoUserEntity();
    }

    @Test
    void testConvertFrom() {
        // GIVEN
        User user = new User("1", "testUsername", "testEmail", "testPassword");
        // WHEN
        MongoUserEntity convertedEntity = MongoUserEntity.convertFrom(user);
        // THEN
        assertEquals("1", convertedEntity.getId().toString());
        assertEquals("testUsername", convertedEntity.getUsername());
        assertEquals("testEmail", convertedEntity.getEmail());
        assertEquals("testPassword", convertedEntity.getPassword());
    }

    @Test
    void testConvertTo() {
        // GIVEN
        mongoUserEntity.setId(new ObjectId("1234567890abcdef"));
        mongoUserEntity.setUsername("testUsername");
        mongoUserEntity.setEmail("testEmail");
        mongoUserEntity.setPassword("testPassword");
        // WHEN
        User convertedUser = mongoUserEntity.convertTo();
        // THEN
        assertEquals("1234567890abcdef", convertedUser.getId());
        assertEquals("testUsername", convertedUser.getUsername());
        assertEquals("testEmail", convertedUser.getEmail());
        assertEquals("testPassword", convertedUser.getPassword());
    }
}