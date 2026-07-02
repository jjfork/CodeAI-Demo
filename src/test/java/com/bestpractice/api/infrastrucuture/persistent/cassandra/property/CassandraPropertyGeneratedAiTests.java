package com.bestpractice.api.infrastrucuture.persistent.cassandra.property;

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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CassandraPropertyGeneratedAiTests {

    private CassandraProperty cassandraProperty;

    @BeforeEach
    void setUp() {
        cassandraProperty = new CassandraProperty();
    }

    @Test
    void testHostsGetterSetterWithMultipleHosts() {
        // GIVEN
        String[] hosts = new String[]{"127.0.0.1", "192.168.1.10"};
        // WHEN
        cassandraProperty.setHosts(hosts);
        String[] result = cassandraProperty.getHosts();
        // THEN
        assertThat(result).isSameAs(hosts);
        assertThat(result).containsExactly("127.0.0.1", "192.168.1.10");
    }

    @Test
    void testHostsGetterSetterWithEmptyArray() {
        // GIVEN
        String[] emptyHosts = new String[0];
        // WHEN
        cassandraProperty.setHosts(emptyHosts);
        String[] result = cassandraProperty.getHosts();
        // THEN
        assertThat(result).isSameAs(emptyHosts);
        assertThat(result).isEmpty();
    }

    @Test
    void testHostsGetterSetterWithNullArray() {
        // GIVEN
        String[] nullHosts = null;
        // WHEN
        cassandraProperty.setHosts(nullHosts);
        String[] result = cassandraProperty.getHosts();
        // THEN
        assertThat(result).isNull();
    }

    @Test
    void testHostsGetterSetterWithSingleElement() {
        // GIVEN
        String[] singleHost = new String[]{"localhost"};
        // WHEN
        cassandraProperty.setHosts(singleHost);
        String[] result = cassandraProperty.getHosts();
        // THEN
        assertThat(result).isSameAs(singleHost);
        assertThat(result).containsExactly("localhost");
    }

    @Test
    void testHostsGetterSetterWithDuplicateElements() {
        // GIVEN
        String[] duplicateHosts = new String[]{"a", "a"};
        // WHEN
        cassandraProperty.setHosts(duplicateHosts);
        String[] result = cassandraProperty.getHosts();
        // THEN
        assertThat(result).isSameAs(duplicateHosts);
        assertThat(result).containsExactly("a", "a");
    }

    @Test
    void testHostsGetterSetterWithNullElement() {
        // GIVEN
        String[] nullElementHosts = new String[]{null};
        // WHEN
        cassandraProperty.setHosts(nullElementHosts);
        String[] result = cassandraProperty.getHosts();
        // THEN
        assertThat(result).isSameAs(nullElementHosts);
        assertThat(result).containsExactly((String) null);
    }

    @Test
    void testKeyspaceGetterSetterWithValidString() {
        // GIVEN
        String keyspace = "test_keyspace";
        // WHEN
        cassandraProperty.setKeyspace(keyspace);
        String result = cassandraProperty.getKeyspace();
        // THEN
        assertThat(result).isEqualTo("test_keyspace");
    }

    @Test
    void testKeyspaceGetterSetterWithEmptyString() {
        // GIVEN
        String emptyKeyspace = "";
        // WHEN
        cassandraProperty.setKeyspace(emptyKeyspace);
        String result = cassandraProperty.getKeyspace();
        // THEN
        assertThat(result).isEqualTo("");
    }
