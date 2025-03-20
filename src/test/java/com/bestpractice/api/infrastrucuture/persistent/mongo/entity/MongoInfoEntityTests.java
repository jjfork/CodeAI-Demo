package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import org.bson.types.ObjectId;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.infrastrucuture.persistent.mongo.entity.Info;

public class MongoInfoEntityTests {
    @Test
    public void testSomething() {
        // ... Your test logic using Info and ObjectId ...
        Info info = new Info(); 
        ObjectId id = new ObjectId();
        // ... assertions and other tests ...
    }
}
