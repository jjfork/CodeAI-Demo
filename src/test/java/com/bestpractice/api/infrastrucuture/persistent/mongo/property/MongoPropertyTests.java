package com.bestpractice.api.infrastrucuture.persistent.mongo.property;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MongoPropertyTests {
    private MongoProperty mongoProperty;

    @BeforeEach
    void setUp() {
        mongoProperty = new MongoProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - No host set
        String expectedHost = null;
        // WHEN - Get the host
        String actualHost = mongoProperty.getHost();
        // THEN - Assert that the host is null
        assertEquals(expectedHost, actualHost);
    }

    @Test
    void testSetHost() {
        // GIVEN - A host value to set
        String hostValue = "localhost";
        // WHEN - Set the host
        mongoProperty.setHost(hostValue);
        // THEN - Assert that the host is set correctly
        assertEquals(hostValue, mongoProperty.getHost());
    }

    @Test
    void testGetPlatformDatabase() {
        // GIVEN - No platform database set
        String expectedPlatformDatabase = null;
        // WHEN - Get the platform database
        String actualPlatformDatabase = mongoProperty.getPlatformDatabase();
        // THEN - Assert that the platform database is null
        assertEquals(expectedPlatformDatabase, actualPlatformDatabase);
    }

    @Test
    void testSetPlatformDatabase() {
        // GIVEN - A platform database value to set
        String platformDatabaseValue = "platform";
        // WHEN - Set the platform database
        mongoProperty.setPlatformDatabase(platformDatabaseValue);
        // THEN - Assert that the platform database is set correctly
        assertEquals(platformDatabaseValue, mongoProperty.getPlatformDatabase());
    }

    @Test
    void testGetUser() {
        // GIVEN - No user set
        String expectedUser = null;
        // WHEN - Get the user
        String actualUser = mongoProperty.getUser();
        // THEN - Assert that the user is null
        assertEquals(expectedUser, actualUser);
    }

    @Test
    void testSetUser() {
        // GIVEN - A user value to set
        String userValue = "mongodbuser";
        // WHEN - Set the user
        mongoProperty.setUser(userValue);
        // THEN - Assert that the user is set correctly
        assertEquals(userValue, mongoProperty.getUser());
    }

    @Test
    void testGetPassword() {
        // GIVEN - No password set
        String expectedPassword = null;
        // WHEN - Get the password
        String actualPassword = mongoProperty.getPassword();
        // THEN - Assert that the password is null
        assertEquals(expectedPassword, actualPassword);
    }

    @Test
    void testSetPassword() {
        // GIVEN - A password value to set
        String passwordValue = "mongodbpassword";
        // WHEN - Set the password
        mongoProperty.setPassword(passwordValue);
        // THEN - Assert that the password is set correctly
        assertEquals(passwordValue, mongoProperty.getPassword());
    }
}
