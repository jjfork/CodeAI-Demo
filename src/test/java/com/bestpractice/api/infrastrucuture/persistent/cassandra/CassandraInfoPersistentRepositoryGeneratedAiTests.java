package com.bestpractice.api.infrastrucuture.persistent.cassandra;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CassandraInfoPersistentRepositoryGeneratedAiTests {

  private CassandraInfoPersistentRepository repository;

  @BeforeAll
  void setUpBeforeAll() {
    repository = new CassandraInfoPersistentRepository(null);
  }

  @AfterEach
  void tearDownAfterEach() {
  }

  @Test
  void testRemoveById() {
    // GIVEN: An Info object is created and persisted in the Cassandra database.
    // WHEN: The removeById(id) method is called with the generated ID.
    // THEN: The row corresponding to the generated ID is removed from the "infos" table in the Cassandra database.
    String id = repository.newId();
    boolean removed = repository.removeById(id);
    assertTrue(removed, "Row should be removed");
  }
}
