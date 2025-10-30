package com.bestpractice.api.infrastrucuture.persistent.mongo.property;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class MongoPropertyGeneratedAiTests {

    private MongoProperty mongoProperty;

    @BeforeEach
    void setUp() {
        mongoProperty = new MongoProperty();
    }

    @Test
    void testSetAndGetHost() {
        // GIVEN: a host value
        String expectedHost = "localhost";

        // WHEN: setting the host
        mongoProperty.setHost(expectedHost);

        // THEN: the retrieved host should match the expected value
        assertEquals(expectedHost, mongoProperty.getHost());
    }

    @Test
    void testSetAndGetPort() {
        // GIVEN: a port value
        int expectedPort = 27017;

        // WHEN: setting the port
        mongoProperty.setPort(expectedPort);

        // THEN: the retrieved port should match the expected value
        assertEquals(expectedPort, mongoProperty.getPort());
    }

    @Test
    void testSetAndGetAuthDatabase() {
        // GIVEN: an auth database value
        String expectedAuthDatabase = "admin";

        // WHEN: setting the auth database
        mongoProperty.setAuthDatabase(expectedAuthDatabase);

        // THEN: the retrieved auth database should match the expected value
        assertEquals(expectedAuthDatabase, mongoProperty.getAuthDatabase());
    }

    @Test
    void testSetAndGetPlatformDatabase() {
        // GIVEN: a platform database value
        String expectedPlatformDatabase = "platformDB";

        // WHEN: setting the platform database
        mongoProperty.setPlatformDatabase(expectedPlatformDatabase);

        // THEN: the retrieved platform database should match the expected value
        assertEquals(expectedPlatformDatabase, mongoProperty.getPlatformDatabase());
    }

    @Test
    void testSetAndGetUser() {
        // GIVEN: a user value
        String expectedUser = "testUser";

        // WHEN: setting the user
        mongoProperty.setUser(expectedUser);

        // THEN: the retrieved user should match the expected value
        assertEquals(expectedUser, mongoProperty.getUser());
    }

    @Test
    void testSetAndGetPassword() {
        // GIVEN: a password value (security-sensitive)
        String expectedPassword = "securePassword";

        // WHEN: setting the password
        mongoProperty.setPassword(expectedPassword);

        // THEN: the retrieved password should match the expected value
        assertEquals(expectedPassword, mongoProperty.getPassword());
    }

    @Test
    void testSetPortWithNegativeValue() {
        // GIVEN: a negative port value
        int negativePort = -1;

        // WHEN: setting the port
        mongoProperty.setPort(negativePort);

        // THEN: the retrieved port should match the negative value since no validation exists
        assertEquals(negativePort, mongoProperty.getPort());
    }

    @Test
    void testSetHostWithNullValue() {
        // GIVEN: a null host value
        String nullHost = null;

        // WHEN: setting the host to null
        mongoProperty.setHost(nullHost);

        // THEN: the retrieved host should be null
        assertThat(mongoProperty.getHost()).isNull();
    }
}
