package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfiguringDataStore;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.autoconfigure.jdbc.BaseTestDatabaseConfiguration;

import java.util.List;
import java.util.UUID;

@ExtendWith(MockitoExtension.class)
@AutoConfiguringDataStore
public class InfoPersistentRepositoryTest extends BaseTestDatabaseConfiguration {

    @Autowired
    private InfoPersistentRepository infoPersistentRepository;

    @BeforeEach
    public void setUp() {
        // Clear the database before each test
        infoPersistentRepository.deleteAll();
    }

    @Test
    public void createInfo() {
        // Arrange
        Info info = new Info();
        info.setId(UUID.randomUUID());
        info.setName("Test Info");

        // Act
        infoPersistentRepository.save(info);

        // Assert
        List<Info> retrievedInfos = infoPersistentRepository.findAll();
        assertEquals(1, retrievedInfos.size());
        assertTrue(retrievedInfos.stream().anyMatch(i -> i.getId().equals(info.getId())));
        assertEquals("Test Info", retrievedInfos.stream().filter(i -> i.getId().equals(info.getId())).findFirst().get().getName());
    }

    @Test
    public void findInfoById() {
        // Arrange
        Info info = new Info();
        info.setId(UUID.randomUUID());
        info.setName("Test Info");

        // Act
        infoPersistentRepository.save(info);

        // Assert
        Info retrievedInfo = infoPersistentRepository.findById(info.getId()).get();

        assertEquals("Test Info", retrievedInfo.getName());
    }

    @Test
    public void findAllInfo() {
        // Arrange
        Info info1 = new Info();
        info1.setId(UUID.randomUUID());
        info1.setName("Test Info 1");

        Info info2 = new Info();
        info2.setId(UUID.randomUUID());
        info2.setName("Test Info 2");

        // Act
        infoPersistentRepository.save(info1);
        infoPersistentRepository.save(info2);

        // Assert
        List<Info> retrievedInfos = infoPersistentRepository.findAll();
        assertEquals(2, retrievedInfos.size());
        assertTrue(retrievedInfos.stream().anyMatch(i -> i.getId().equals(info1.getId())));
        assertTrue(retrievedInfos.stream().anyMatch(i -> i.getId().equals(info2.getId())));
    }
}
