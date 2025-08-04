package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
        assertEquals(mongoInfoEntity.getId(), convertedInfo.getId());
        assertEquals("testTitle", convertedInfo.getTitle());
        assertEquals("testDescription", convertedInfo.getDescription());
    }
