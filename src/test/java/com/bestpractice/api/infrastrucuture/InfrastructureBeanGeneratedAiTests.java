package com.bestpractice.api.infrastrucuture;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.infrastrucuture.persistent.InfoPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.UserPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.cassandra.property.CassandraProperty;
import com.bestpractice.api.infrastrucuture.persistent.local.LocalInfoPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.local.LocalUserPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.mongo.MongoUserPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.mongo.property.MongoProperty;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InfrastructureBeanGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // Reset or initialize any shared state before each test
    }

    @Test
    void givenLocalDbRepository_whenUserRepositoryCalled_thenReturnsLocalUserPersistentRepository() {
        // GIVEN
        InfrastructureBean.LocalDbRepository repo = new InfrastructureBean.LocalDbRepository();

        // WHEN
        UserPersistentRepository result = repo.userRepository();

        // THEN
        assertThat(result).isNotNull();
        assertThat(result).isInstanceOf(LocalUserPersistentRepository.class);
    }

    @Test
    void givenLocalDbRepository_whenInfoRepositoryCalled_thenReturnsLocalInfoPersistentRepository() {
        // GIVEN
        InfrastructureBean.LocalDbRepository repo = new InfrastructureBean.LocalDbRepository();

        // WHEN
        InfoPersistentRepository result = repo.infoRepository();

        // THEN
        assertThat(result).isNotNull();
        assertThat(result).isInstanceOf(LocalInfoPersistentRepository.class);
    }

    @Test
    void givenCassandraDbRepository_whenUserRepositoryCalled_thenReturnsLocalUserPersistentRepository() {
        // GIVEN
        CassandraProperty property = Mockito.mock(CassandraProperty.class);
        Mockito.when(property.getHosts()).thenReturn(new String[]{"127.0.0.1:9042"});
        Mockito.when(property.getKeyspace()).thenReturn("testkeyspace");
        InfrastructureBean.CassandraDbRepository repo = new InfrastructureBean.CassandraDbRepository(property);

        // WHEN
        UserPersistentRepository result = repo.userRepository();

        // THEN
        assertThat(result).isNotNull();
        assertThat(result).isInstanceOf(LocalUserPersistentRepository.class);
    }

    @Test
    void givenCassandraDbRepository_whenCqlSessionThrowsException_thenExceptionIsPropagated() {
        // GIVEN
        CassandraProperty property = Mockito.mock(CassandraProperty.class);
        Mockito.when(property.getHosts()).thenThrow(new RuntimeException("Invalid hosts"));
        InfrastructureBean.CassandraDbRepository repo = new InfrastructureBean.CassandraDbRepository(property);

        // WHEN & THEN
        assertThrows(RuntimeException.class, repo::cqlSession);
    }

    @Test
    void givenMongoDbRepository_whenMongoClientCalled_thenReturnsMongoClient() {
        // GIVEN
        MongoProperty property = Mockito.mock(MongoProperty.class);
        Mockito.when(property.getUser()).thenReturn("user");
        Mockito.when(property.getAuthDatabase()).thenReturn("admin");
        Mockito.when(property.getPassword()).thenReturn("pass");
        Mockito.when(property.getHost()).thenReturn("localhost");
        Mockito.when(property.getPort()).thenReturn(27017);
        Mockito.when(property.getPlatformDatabase()).thenReturn("testdb");
        InfrastructureBean.MongoDbRepository repo = new InfrastructureBean.MongoDbRepository(property);

        // WHEN
        MongoClient client = repo.mongoClient();

        // THEN
        assertThat(client).isNotNull();
        client.close();
    }

    @Test
    void givenMongoDbRepository_whenMongoDatabaseCalled_thenReturnsMongoDatabase() {
        // GIVEN
        MongoProperty property = Mockito.mock(MongoProperty.class);
        Mockito.when(property.getUser()).thenReturn("user");
        Mockito.when(property.getAuthDatabase()).thenReturn("admin");
        Mockito.when(property.getPassword()).thenReturn("pass");
        Mockito.when(property.getHost()).thenReturn("localhost");
        Mockito.when(property.getPort()).thenReturn(27017);
        Mockito.when(property.getPlatformDatabase()).thenReturn("testdb");
        InfrastructureBean.MongoDbRepository repo = new InfrastructureBean.MongoDbRepository(property);

        // WHEN
        MongoDatabase db = repo.mongoDatabase();

        // THEN
        assertThat(db).isNotNull();
    }

    @Test
    void givenMongoDbRepository_whenUserRepositoryCalled_thenReturnsMongoUserPersistentRepository() {
        // GIVEN
        MongoProperty property = Mockito.mock(MongoProperty.class);
        Mockito.when(property.getUser()).thenReturn("user");
        Mockito.when(property.getAuthDatabase()).thenReturn("admin");
        Mockito.when(property.getPassword()).thenReturn("pass");
        Mockito.when(property.getHost()).thenReturn("localhost");
        Mockito.when(property.getPort()).thenReturn(27017);
        Mockito.when(property.getPlatformDatabase()).thenReturn("testdb");
        InfrastructureBean.MongoDbRepository repo = new InfrastructureBean.MongoDbRepository(property);

        // WHEN
        UserPersistentRepository result = repo.userRepository();

        // THEN
        assertThat(result).isNotNull();
        assertThat(result).isInstanceOf(MongoUserPersistentRepository.class);
    }

    @Test
    void givenMongoDbRepository_whenInfoRepositoryCalled_thenReturnsMongoInfoPersistentRepository() {
        // GIVEN
        MongoProperty property = Mockito.mock(MongoProperty.class);
        Mockito.when(property.getUser()).thenReturn("user");
        Mockito.when(property.getAuthDatabase()).thenReturn("admin");
        Mockito.when(property.getPassword()).thenReturn("pass");
        Mockito.when(property.getHost()).thenReturn("localhost");
        Mockito.when(property.getPort()).thenReturn(27017);
        Mockito.when(property.getPlatformDatabase()).thenReturn("testdb");
        InfrastructureBean.MongoDbRepository repo = new InfrastructureBean.MongoDbRepository(property);

        // WHEN
        InfoPersistentRepository result = repo.infoRepository();

        // THEN
        assertThat(result).isNotNull();
        assertThat(result).isInstanceOf(MongoInfoPersistentRepository.class);
    }

    @Test
    void givenMongoDbRepository_whenMongoClientThrowsException_thenExceptionIsPropagated() {
        // GIVEN
        MongoProperty property = Mockito.mock(MongoProperty.class);
        Mockito.when(property.getUser()).thenThrow(new IllegalArgumentException("Invalid user"));
        InfrastructureBean.MongoDbRepository repo = new InfrastructureBean.MongoDbRepository(property);

        // WHEN & THEN
        assertThrows(IllegalArgumentException.class, repo::mongoClient);
    }

    @Test
    void givenMongoDbRepository_whenMongoDatabaseThrowsException_thenExceptionIsPropagated() {
        // GIVEN
        MongoProperty property = Mockito.mock(MongoProperty.class);
        Mockito.when(property.getPlatformDatabase()).thenThrow(new IllegalStateException("Invalid database"));
        InfrastructureBean.MongoDbRepository repo = new InfrastructureBean.MongoDbRepository(property);
        MongoClient client = Mockito.mock(MongoClient.class);
        InfrastructureBean.MongoDbRepository spyRepo = Mockito.spy(repo);
        Mockito.doReturn(client).when(spyRepo).mongoClient();

        // WHEN & THEN
        assertThrows(IllegalStateException.class, spyRepo::mongoDatabase);
    }
}
