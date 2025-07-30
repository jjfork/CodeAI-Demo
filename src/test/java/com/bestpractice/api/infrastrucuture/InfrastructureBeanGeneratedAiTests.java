package com.bestpractice.api.infrastrucuture.persistent;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CassandraInfoPersistentRepositoryGeneratedAiTests {

  @Mock
  private CqlSession mockCqlSession;

  @InjectMocks
  private CassandraInfoPersistentRepository cassandraInfoPersistentRepository;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testFindAll() {
    // GIVEN
    String id = "testId";
    String title = "testTitle";
    String description = "testDescription";
    Info info = new Info();
    info.setId(id);
    info.setTitle(title);
    info.setDescription(description);

    // WHEN
    cassandraInfoPersistentRepository.findAll();

    // THEN
  }

  @Test
  void testFindById() {
    // GIVEN
    String id = "testId";
    String title = "testTitle";
    String description = "testDescription";
    Info info = new Info();
    info.setId(id);
    info.setTitle(title);
    info.setDescription(description);

    // WHEN
    cassandraInfoPersistentRepository.findById(id);

    // THEN
  }

  @Test
  void testInsert() {
    // GIVEN
    String id = "testId";
    String title = "testTitle";
    String description = "testDescription";
    Info info = new Info();
    info.setId(id);
    info.setTitle(title);
    info.setDescription(description);

    // WHEN
    cassandraInfoPersistentRepository.insert(info);

    // THEN
  }

  @Test
  void testReplace() {
    // GIVEN
    String id = "testId";
    String title = "testTitle";
    String description = "testDescription";
    Info info = new Info();
    info.setId(id);
    info.setTitle(title);
    info.setDescription(description);

    // WHEN
    cassandraInfoPersistentRepository.replace(id, info);

    // THEN
  }

  @Test
  void testRemoveById() {
    // GIVEN
    String id = "testId";

    // WHEN
    cassandraInfoPersistentRepository.removeById(id);

    // THEN
  }
}
