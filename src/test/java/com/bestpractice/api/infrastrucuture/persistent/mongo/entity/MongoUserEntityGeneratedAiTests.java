package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MongoUserEntityGeneratedAiTests {

    private MongoUserEntity mongoUserEntity;

    @BeforeEach
    void setUp() {
        mongoUserEntity = new MongoUserEntity();
    }

    @Test
    void defaultConstructor_ShouldInitializeFieldsToNull() {
        // GIVEN
        // WHEN
        ObjectId id = mongoUserEntity.getId();
        String username = mongoUserEntity.getUsername();
        String email = mongoUserEntity.getEmail();
        String password = mongoUserEntity.getPassword();
        // THEN
        assertEquals(null, id);
        assertEquals(null, username);
        assertEquals(null, email);
        assertEquals(null, password);
    }

    @Test
    void parameterizedConstructor_ShouldSetAllFields() {
        // GIVEN
        ObjectId id = new ObjectId();
        String username = "john_doe";
        String email = "john@example.com";
        String password = "secret";
        // WHEN
        MongoUserEntity entity = new MongoUserEntity(id, username, email, password);
        // THEN
        assertEquals(id, entity.getId());
        assertEquals(username, entity.getUsername());
        assertEquals(email, entity.getEmail());
        assertEquals(password, entity.getPassword());
    }
