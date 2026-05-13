package com.bestpractice.api.infrastrucuture.persistent.mongo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bestpractice.api.infrastrucuture.persistent.MongoInfoPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.mongo.entity.MongoInfoEntity;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@ExtendWith(MockitoExtension.class)
class MongoInfoPersistentRepositoryGeneratedAiTests {

    @Mock
    private MongoDatabase mockDatabase;

    @Mock
    private MongoCollection<MongoInfoEntity> mockCollection;

    private MongoInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new MongoInfoPersistentRepository(null, mockDatabase);
        // Inject the mocked collection into the repository
        try {
            java.lang.reflect.Field collectionField = MongoInfoPersistentRepository.class.getDeclaredField("collection");
            collectionField.setAccessible(true);
            collectionField.set(repository, mockCollection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void newId_ShouldReturnValidObjectIdString() {
        // GIVEN nothing

        // WHEN
        String id = repository.newId();

        // THEN
        assertThat(id).isNotNull();
        assertThat(id).matches("^[a-fA-F0-9]{24}$");
    }
}
