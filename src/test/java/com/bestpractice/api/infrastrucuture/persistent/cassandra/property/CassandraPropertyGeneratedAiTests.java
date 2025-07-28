package com.bestpractice.api.infrastrucuture.persistent.cassandra.property;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CassandraPropertyGeneratedAiTests {

    private CassandraProperty cassandraProperty;

    @BeforeEach
    void setUp() {
        cassandraProperty = new CassandraProperty();
    }

    @Test
    void testGetHosts() {
        // GIVEN - Set up the expected hosts array
        String[] expectedHosts = {"localhost", "127.0.0.1"};
        // WHEN - Call the getHosts method
        cassandraProperty.setHosts(expectedHosts);
        String[] actualHosts = cassandraProperty.getHosts();
        // THEN - Assert that the actual hosts array matches the expected array
        assertArrayEquals(expectedHosts, actualHosts);
    }

    @Test
    void testGetKeyspace() {
        // GIVEN - Set up the expected keyspace
        String expectedKeyspace = "my_keyspace";
        // WHEN - Call the getKeyspace method
        cassandraProperty.setKeyspace(expectedKeyspace);
        String actualKeyspace = cassandraProperty.getKeyspace();
        // THEN - Assert that the actual keyspace matches the expected keyspace
        assertEquals(expectedKeyspace, actualKeyspace);
    }

    @Test
    void testGetUser() {
        // GIVEN - Set up the expected user
        String expectedUser = "cassandra_user";
        // WHEN - Call the getUser method
        cassandraProperty.setUser(expectedUser);
        String actualUser = cassandraProperty.getUser();
        // THEN - Assert that the actual user matches the expected user
        assertEquals(expectedUser, actualUser);
    }

    @Test
    void testGetPassword() {
        // GIVEN - Set up the expected password
        String expectedPassword = "cassandra_password";
        // WHEN - Call the getPassword method
        cassandraProperty.setPassword(expectedPassword);
        String actualPassword = cassandraProperty.getPassword();
        // THEN - Assert that the actual password matches the expected password
        assertEquals(expectedPassword, actualPassword);
    }
}
