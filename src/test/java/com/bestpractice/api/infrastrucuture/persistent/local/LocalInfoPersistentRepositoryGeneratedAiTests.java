package com.bestpractice.api.infrastrucuture.persistent.local;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.infrastrucuture.entity.Info;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LocalInfoPersistentRepositoryGeneratedAiTests {

    private LocalInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new LocalInfoPersistentRepository();
    }

    @Test
    void givenRepository_whenNewId_thenUniqueIdGenerated() {
        // GIVEN

        // WHEN
        String id1 = repository.newId();
        String id2 = repository.newId();

        // THEN
        assertNotNull(id1);
        assertNotNull(id2);
        assertNotEquals(id1, id2);
    }

    @Test
    void givenEmptyRepository_whenFindAll_thenEmptyListReturned() {
        // GIVEN

        // WHEN
        List<Info> all = repository.findAll();

        // THEN
        assertNotNull(all);
        assertTrue(all.isEmpty());
    }

    @Test
    void givenInsertedInfo_whenFindById_thenInfoReturned() {
        // GIVEN
        Info info = new Info();
        String id = repository.newId();
        info.setId(id);
        repository.insert(info);

        // WHEN
        Info found = repository.findById(id);

        // THEN
        assertNotNull(found);
        assertEquals(id, found.getId());
    }

    @Test
    void givenNonExistingId_whenFindById_thenNullReturned() {
        // GIVEN

        // WHEN
        Info found = repository.findById("non-existing-id");

        // THEN
        assertNull(found);
    }

    @Test
    void givenInfo_whenInsert_thenInfoAdded() {
        // GIVEN
        Info info = new Info();
        info.setId(repository.newId());

        // WHEN
        Info inserted = repository.insert(info);

        // THEN
        assertEquals(info, inserted);
        assertTrue(repository.findAll().contains(info));
    }

    @Test
    void givenNonExistingInfo_whenReplace_thenThrowException() {
        // GIVEN
        Info newInfo = new Info();
        newInfo.setId("some-id");

        // WHEN / THEN
        assertThrows(RuntimeException.class, () -> repository.replace("non-existing-id", newInfo));
    }

    @Test
    void givenExistingInfo_whenRemoveById_thenInfoRemoved() {
        // GIVEN
        Info info = new Info();
        String id = repository.newId();
        info.setId(id);
        repository.insert(info);

        // WHEN
        boolean result = repository.removeById(id);

        // THEN
        assertTrue(result);
        assertNull(repository.findById(id));
    }

    @Test
    void givenNonExistingInfo_whenRemoveById_thenReturnTrue() {
        // GIVEN

        // WHEN
        boolean result = repository.removeById("non-existing-id");

        // THEN
        assertTrue(result);
    }
}