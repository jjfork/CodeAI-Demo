package com.bestpractice.api.common.util;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.NotSerializableException;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // Reset any state if needed before each test
    }

    @Test
    void testCalculateDateAddsOneYear() {
        // GIVEN: Current date
        Date now = new Date();

        // WHEN: calculateDate is called
        Date result = Util.calculateDate();

        // THEN: The result should be approximately one year ahead
        Calendar calNow = Calendar.getInstance();
        calNow.setTime(now);
        calNow.add(Calendar.YEAR, 1);

        Calendar calResult = Calendar.getInstance();
        calResult.setTime(result);

        assertEquals(calNow.get(Calendar.YEAR), calResult.get(Calendar.YEAR));
        assertEquals(calNow.get(Calendar.MONTH), calResult.get(Calendar.MONTH));
        assertEquals(calNow.get(Calendar.DAY_OF_MONTH), calResult.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    void testDeepCloneCreatesEqualButDistinctObject() throws IOException, ClassNotFoundException {
        // GIVEN: A serializable object
        String original = "TestString";

        // WHEN: deepClone is called
        String cloned = Util.deepClone(original);

        // THEN: The cloned object should be equal but not the same reference
        assertEquals(original, cloned);
        assertNotSame(original, cloned);
    }

    @Test
    void testDeepCloneThrowsNotSerializableExceptionForNonSerializableObject() {
        // GIVEN: A non-serializable object
        Object nonSerializable = new Object();

        // WHEN & THEN: deepClone should throw NotSerializableException
        assertThrows(NotSerializableException.class, () -> Util.deepClone(nonSerializable));
    }

    @Test
    void testDeepCloneThrowsClassNotFoundException() {
        // GIVEN: A serializable object that will throw ClassNotFoundException during deserialization
        ClassNotFoundTrigger trigger = new ClassNotFoundTrigger();

        // WHEN & THEN: deepClone should throw ClassNotFoundException
        assertThrows(ClassNotFoundException.class, () -> Util.deepClone(trigger));
    }

    @Test
    void testGetSpringProfileActiveReturnsEnvValue() {
        // GIVEN: Environment variable SPRING_PROFILES_ACTIVE may be set externally
        String expected = System.getenv("SPRING_PROFILES_ACTIVE");

        // WHEN: getSpringProfileActive is called
        String profile = Util.getSpringProfileActive();

        // THEN: The result should match the environment variable or be null
        assertEquals(expected, profile);
    }

    // Helper class to simulate ClassNotFoundException during deserialization
    private static class ClassNotFoundTrigger implements java.io.Serializable {
        private static final long serialVersionUID = 1L;
        private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new ClassNotFoundException("Simulated ClassNotFoundException");
        }
    }
}
