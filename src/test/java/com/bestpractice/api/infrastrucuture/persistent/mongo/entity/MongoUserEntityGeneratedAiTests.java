package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MongoUserEntityGeneratedAiTests {

    private MongoUserEntity mongoUserEntity;

    @BeforeEach
    void setUp() {
        mongoUserEntity = new MongoUserEntity();
    }

    @Test
    void testSetAndGetId() {
        // GIVEN
        ObjectId id = new ObjectId();

        // WHEN
        mongoUserEntity.setId(id);

        // THEN
        assertEquals(id, mongoUserEntity.getId());
    }

    @Test
    void testSetAndGetUsername() {
        // GIVEN
        String username = "testUser";

        // WHEN
        mongoUserEntity.setUsername(username);

        // THEN
        assertEquals(username, mongoUserEntity.getUsername());
    }

    @Test
    void testSetAndGetEmail() {
        // GIVEN
        String email = "test@example.com";

        // WHEN
        mongoUserEntity.setEmail(email);

        // THEN
        assertEquals(email, mongoUserEntity.getEmail());
    }

    @Test
    void testSetAndGetPassword() {
        // GIVEN
        String password = "securePassword";

        // WHEN
        mongoUserEntity.setPassword(password);

        // THEN
        assertEquals(password, mongoUserEntity.getPassword());
    }

    @Test
    void testConstructorWithParameters() {
        // GIVEN
        ObjectId id = new ObjectId();
        String username = "user1";
        String email = "user1@example.com";
        String password = "pass123";

        // WHEN
        MongoUserEntity entity = new MongoUserEntity(id, username, email, password);

        // THEN
        assertEquals(id, entity.getId());
        assertEquals(username, entity.getUsername());
        assertEquals(email, entity.getEmail());
        assertEquals(password, entity.getPassword());
    }

    @Test
    void testConvertFromUser() {
        // GIVEN
        User user = new User();
        ObjectId id = new ObjectId();
        user.setId(id.toString());
        user.setUsername("convertUser");
        user.setEmail("convert@example.com");
        user.setPassword("convertPass");

        // WHEN
        MongoUserEntity entity = MongoUserEntity.convertFrom(user);

        // THEN
        assertEquals(id, entity.getId());
        assertEquals(user.getUsername(), entity.getUsername());
        assertEquals(user.getEmail(), entity.getEmail());
        assertEquals(user.getPassword(), entity.getPassword());
    }

    @Test
    void testConvertFromUserWithInvalidIdThrowsException() {
        // GIVEN
        User user = new User();
        user.setId("invalidObjectId");
        user.setUsername("user");
        user.setEmail("email@example.com");
        user.setPassword("pass");

        // WHEN & THEN
        assertThrows(IllegalArgumentException.class, () -> MongoUserEntity.convertFrom(user));
    }

    @Test
    void testConvertFromUserWithNullIdThrowsException() {
        // GIVEN
        User user = new User();
        user.setId(null);
        user.setUsername("user");
        user.setEmail("email@example.com");
        user.setPassword("pass");

        // WHEN & THEN
        assertThrows(IllegalArgumentException.class, () -> MongoUserEntity.convertFrom(user));
    }

    @Test
    void testConvertToUser() {
        // GIVEN
        ObjectId id = new ObjectId();
        mongoUserEntity.setId(id);
        mongoUserEntity.setUsername("mongoUser");
        mongoUserEntity.setEmail("mongo@example.com");
        mongoUserEntity.setPassword("mongoPass");

        // WHEN
        User user = mongoUserEntity.convertTo();

        // THEN
        assertEquals(id.toString(), user.getId());
        assertEquals("mongoUser", user.getUsername());
        assertEquals("mongoPass", user.getPassword());
        assertNull(user.getEmail());
    }

    @Test
    void testConvertToUserWithNullIdThrowsException() {
        // GIVEN
        mongoUserEntity.setId(null);
        mongoUserEntity.setUsername("mongoUser");
        mongoUserEntity.setPassword("mongoPass");

        // WHEN & THEN
        assertThrows(NullPointerException.class, () -> mongoUserEntity.convertTo());
    }
}
