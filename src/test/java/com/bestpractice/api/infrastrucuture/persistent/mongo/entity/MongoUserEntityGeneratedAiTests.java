package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MongoUserEntityGeneratedAiTests {

    private MongoUserEntity entity;
    private User user;

    @BeforeEach
    void setUp() {
        entity = new MongoUserEntity();
        user = new User();
    }

    @Test
    void testGettersAndSetters() {
        // GIVEN
        ObjectId id = new ObjectId();
        String username = "john_doe";
        String email = "john@example.com";
        String password = "secret";

        // WHEN
        entity.setId(id);
        entity.setUsername(username);
        entity.setEmail(email);
        entity.setPassword(password);

        // THEN
        assertThat(entity.getId()).isEqualTo(id);
        assertThat(entity.getUsername()).isEqualTo(username);
        assertThat(entity.getEmail()).isEqualTo(email);
        assertThat(entity.getPassword()).isEqualTo(password);
    }

    @Test
    void testConvertFrom() {
        // GIVEN
        String idStr = new ObjectId().toHexString();
        String username = "alice";
        String email = "alice@example.com";
        String password = "password123";
        user.setId(idStr);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        // WHEN
        MongoUserEntity converted = MongoUserEntity.convertFrom(user);

        // THEN
        assertThat(converted.getId()).isNotNull();
        assertThat(converted.getId().toHexString()).isEqualTo(idStr);
        assertThat(converted.getUsername()).isEqualTo(username);
        assertThat(converted.getEmail()).isEqualTo(email);
        assertThat(converted.getPassword()).isEqualTo(password);
    }
