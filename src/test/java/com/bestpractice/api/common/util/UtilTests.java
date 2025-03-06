package com.bestpractice.api.common.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UtilTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCalculateDate() {
        // GIVEN - Today's date
        Date today = new Date();
        // WHEN - Calculate the date one year from today
        Date futureDate = Util.calculateDate();
        // THEN - The calculated date should be one year after today
        assertTrue(futureDate.after(today));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.YEAR, 1);
        assertEquals(calendar.getTime(), futureDate);
    }

    @Test
    void testDeepClone() throws IOException, ClassNotFoundException {
        // GIVEN - A sample object to clone
        Date date = new Date();
        // WHEN - Deep clone the object
        Date clonedDate = Util.deepClone(date);
        // THEN - The cloned object should be equal to the original object
        assertEquals(date, clonedDate);
    }

    @Test
    void testGetSpringProfileActive() {
        // GIVEN - No specific environment variable set
        // WHEN - Get the active Spring profile
        String activeProfile = Util.getSpringProfileActive();
        // THEN - The returned value should be null or empty if no profile is active
        assertNull(activeProfile);
    }
}
