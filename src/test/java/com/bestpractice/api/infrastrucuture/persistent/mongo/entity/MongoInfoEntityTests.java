package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MongoInfoEntityTests {

    private MongoInfoEntity mongoInfoEntity;

    @BeforeEach
    void setUp() {
        mongoInfoEntity = new MongoInfoEntity();
    }

    @Test
    void testConvertFrom() {
        // GIVEN
        com.bestpractice.api.infrastrucuture.persistent.mongo.entity.Info info = new com.bestpractice.api.infrastrucuture.persistent.mongo.entity.Info();
        info.setId(new org.bson.types.ObjectId());
        info.setTitle("testTitle");
        info.setContent("textContent");
        // WHEN
        MongoInfoEntity mongoInfoEntity = MongoInfoEntity.convertFrom(info);
        // THEN
        assertEquals(info.getId(), mongoInfoEntity.getId());
        assertEquals("testTitle", mongoInfoEntity.getTitle());
        assertEquals("textContent", mongoInfoEntity.getContent());
    }

    @Test
    void testConvertTo() {
        // GIVEN
        mongoInfoEntity.setId(new org.bson.types.ObjectId());
        mongoInfoEntity.setTitle("testTitle");
        mongoInfoEntity.setContent("textContent");
        // WHEN
        com.bestpractice.api.infrastrucuture.persistent.mongo.entity.Info info = mongoInfoEntity.convertTo();
        // THEN
        assertEquals(mongoInfoEntity.getId(), info.getId());
        assertEquals("testTitle", info.getTitle());
        assertEquals("textContent", info.getContent());
    }
}