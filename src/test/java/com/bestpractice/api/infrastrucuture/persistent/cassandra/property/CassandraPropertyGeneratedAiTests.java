package com.bestpractice.api.infrastrucuture.persistent.cassandra.property;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CassandraPropertyGeneratedAiTests {

    private CassandraProperty cassandraProperty;

    @BeforeEach
    void setUp() {
        cassandraProperty = new CassandraProperty();
        cassandraProperty.setHosts(new String[]{"localhost", "127.0.0.1"});
        cassandraProperty.setKeyspace("my_keyspace");
        cassandraProperty.setUser("cassandra_user");
        cassandraProperty.setPassword("secure_password");
    }

    @Test
    void testGetHosts() {
        // GIVEN - Set up the expected hosts array
        String[] expectedHosts = {"localhost", "127.0.0.1"};
        // WHEN - Call the getHosts method
        String[] actualHosts = cassandraProperty.getHosts();
        // THEN - Assert that the actual hosts array matches the expected array
        assertArrayEquals(expectedHosts, actualHosts);
    }

    @Test
    void testSetHosts() {
        // GIVEN - Set up the new hosts array
        String[] newHosts = {"newHost1", "newHost2"};
        // WHEN - Call the setHosts method with the new hosts array
        cassandraProperty.setHosts(newHosts);
        // THEN - Assert that the actual hosts array matches the new hosts array
        assertArrayEquals(newHosts, cassandraProperty.getHosts());
    }

    @Test
    void testGetKeyspace() {
        // GIVEN - Set up the expected keyspace
        String expectedKeyspace = "my_keyspace";
        // WHEN - Call the getKeyspace method
        String actualKeyspace = cassandraProperty.getKeyspace();
        // THEN - Assert that the actual keyspace matches the expected keyspace
        assertEquals(expectedKeyspace, actualKeyspace);
    }

    @Test
    void testSetKeyspace() {
        // GIVEN - Set up the new keyspace
        String newKeyspace = "new_keyspace";
        // WHEN - Call the setKeyspace method with the new keyspace
        cassandraProperty.setKeyspace(newKeyspace);
        // THEN - Assert that the actual keyspace matches the new keyspace
        assertEquals(newKeyspace, cassandraProperty.getKeyspace());
    }

    @Test
    void testGetUser() {
        // GIVEN - Set up the expected user
        String expectedUser = "cassandra_user";
        // WHEN - Call the getUser method
        String actualUser = cassandraProperty.getUser();
        // THEN - Assert that the actual user matches the expected user
        assertEquals(expectedUser, actualUser);
    }

    @Test
    void testSetUser() {
        // GIVEN - Set up the new user
        String newUser = "new_user";
        // WHEN - Call the setUser method with the new user
        cassandraProperty.setUser(newUser);
        // THEN - Assert that the actual user matches the new user
        assertEquals(newUser, cassandraProperty.getUser());
    }

    @Test
    void testGetPassword() {
        // GIVEN - Set up the expected password
        String expectedPassword = "secure_password";
        // WHEN - Call the getPassword method
        String actualPassword = cassandraProperty.getPassword();
        // THEN - Assert that the actual password matches the expected password
        assertEquals(expectedPassword, actualPassword);
    }

    @Test
    void testSetPassword() {
        // GIVEN - Set up the new password
        String newPassword = "new_password";
        // WHEN - Call the setPassword method with the new password
        cassandraProperty.setPassword(newPassword);
        // THEN - Assert that the actual password matches the new password
        assertEquals(newPassword, cassandraProperty.getPassword());
    }

}
