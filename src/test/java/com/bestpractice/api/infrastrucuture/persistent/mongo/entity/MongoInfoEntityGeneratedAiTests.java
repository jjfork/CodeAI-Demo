package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.infrastrucuture.entity.Info;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.MockitoExtension;

@Test
class MongoInfoEntityGeneratedAiTests {

    @Test
    void constructor_validInput() {
        // GIVEN: A new ObjectId, title, and description.
        ObjectId id = new ObjectId();
        String title = "Test Title";
        String description = "Test Description";

        // WHEN: The MongoInfoEntity constructor is called with the provided values.
        MongoInfoEntity entity = new MongoInfoEntity(id, title, description);

        // THEN: The entity's id, title, and description should be set to the provided values.
        assertEquals(id, entity.getId());
        assertEquals(title, entity.getTitle());
        assertEquals(description, entity.getDescription());
    }

    @Test
    void setId_updatesId() {
        // GIVEN: A MongoInfoEntity with an initial id.
        ObjectId initialId = new ObjectId();
        MongoInfoEntity entity = new MongoInfoEntity(initialId, "Test Title", "Test Description");

        // WHEN: The setId method is called with a new ObjectId.
        entity.setId(new ObjectId());

        // THEN: The entity's id should be updated to the new ObjectId.
        assertEquals(new ObjectId(), entity.getId());
    }

    @Test
    void setTitle_updatesTitle() {
        // GIVEN: A MongoInfoEntity with an initial title.
        ObjectId id = new ObjectId();
        MongoInfoEntity entity = new MongoInfoEntity(id, "Test Title", "Test Description");

        // WHEN: The setTitle method is called with a new title.
        entity.setTitle("New Title");

        // THEN: The entity's title should be updated to the new title.
        assertEquals("New Title", entity.getTitle());
    }

    @Test
    void setDescription_updatesDescription() {
        // GIVEN: A MongoInfoEntity with an initial description.
        ObjectId id = new ObjectId();
        MongoInfoEntity entity = new MongoInfoEntity(id, "Test Title", "Test Description");

        // WHEN: The setDescription method is called with a new description.
        entity.setDescription("New Description");

        // THEN: The entity's description should be updated to the new description.
        assertEquals("New Description", entity.getDescription());
    }

    @Test
    void convertFrom_convertsInfoToMongoInfoEntity() {
        // GIVEN: An Info object with id, title, and description.
        Info info = new Info(new ObjectId(), "Test Title", "Test Description");

        // WHEN: The convertFrom method is called with the Info object.
        MongoInfoEntity entity = MongoInfoEntity.convertFrom(info);

        // THEN: The entity's id, title, and description should be set to the values from the Info object.
        assertEquals(new ObjectId(), entity.getId());
        assertEquals("Test Title", entity.getTitle());
        assertEquals("Test Description", entity.getDescription());
    }

    @Test
    void convertTo_convertsMongoInfoEntityToInfo() {
        // GIVEN: A MongoInfoEntity with id, title, and description.
        ObjectId id = new ObjectId();
        MongoInfoEntity entity = new MongoInfoEntity(id, "Test Title", "Test Description");

        // WHEN: The convertTo method is called on the entity.
        Info info = entity.convertTo();

        // THEN: The info object's id, title, and description should be set to the values from the entity.
        assertEquals(new ObjectId(), info.getId());
        assertEquals("Test Title", info.getTitle());
        assertEquals("Test Description", info.getDescription());
    }
}
