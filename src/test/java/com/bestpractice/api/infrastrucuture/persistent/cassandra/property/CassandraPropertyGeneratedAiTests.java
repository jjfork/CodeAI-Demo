package com.bestpractice.api.infrastrucuture.persistent.cassandra.property;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

@org.junit.jupiter.api.extension.ExtendWith(CassandraPropertyExtension.class)
class CassandraPropertyGeneratedAiTests {

    private CassandraProperty cassandraProperty;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        cassandraProperty = new CassandraProperty();
    }

    @org.junit.jupiter.api.Test
    void testGettersAndSetters() {
        // GIVEN: A new CassandraProperty instance
        // WHEN: The getters and setters are called
        // THEN: The properties are updated correctly
        String[] hosts = {"host1", "host2"};
        cassandraProperty.setHosts(hosts);
        assertEquals(hosts, cassandraProperty.getHosts());

        String keyspaceValue = "myKeyspace";
        cassandraProperty.setKeyspace(keyspaceValue);
        assertEquals(keyspaceValue, cassandraProperty.getKeyspace());

        String userValue = "cassandraUser";
        cassandraProperty.setUser(userValue);
        assertEquals(userValue, cassandraProperty.getUser());

        String passwordValue = "cassandraPassword";
        cassandraProperty.setPassword(passwordValue);
        assertEquals(passwordValue, cassandraProperty.getPassword());
    }
}
