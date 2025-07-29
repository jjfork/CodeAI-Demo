package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MongoInfoEntityGeneratedAiTests {

    private MongoInfoEntity mongoInfoEntity;

    @BeforeEach
    void setUp() {
        mongoInfoEntity = new MongoInfoEntity();
    }

    @Test
    void testConvertFrom() {
        // GIVEN
        Info info = new Info();
        info.setId("testId");
        info.setTitle("testTitle");
        info.setDescription("testDescription");
        // WHEN
        MongoInfoEntity convertedEntity = MongoInfoEntity.convertFrom(info);
        // THEN
        assertEquals("testId", convertedEntity.getId().toString());
        assertEquals("testTitle", convertedEntity.getTitle());
        assertEquals("testDescription", convertedEntity.getDescription());
    }

    @Test
    void testConvertTo() {
        // GIVEN
        mongoInfoEntity.setId(new ObjectId("testObjectId"));
        mongoInfoEntity.setTitle("testTitle");
        mongoInfoEntity.setDescription("testDescription");
        // WHEN
        Info convertedInfo = mongoInfoEntity.convertTo();
        // THEN
        assertEquals("testObjectId", convertedInfo.getId());
        assertEquals("testTitle", convertedInfo.getTitle());
        assertEquals("testDescription", convertedInfo.getDescription());
    }
}