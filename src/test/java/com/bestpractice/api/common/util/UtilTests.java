package com.bestpractice.api.common.util;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

class UtilTests {
    private Util util = new Util();

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCalculateDate() {
        // GIVEN - Today's date
        Date today = new Date();
        // WHEN - Calculate the date one year from today
        Date futureDate = util.calculateDate();
        // THEN - The calculated date should be one year after today
        assertEquals(today.getYear() + 1, futureDate.getYear());
    }

    @Test
    void testDeepClone() throws IOException, ClassNotFoundException {
        // GIVEN - A sample object to clone
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        // WHEN - Clone the calendar object
        Calendar clonedCalendar = util.deepClone(calendar);
        // THEN - The cloned calendar should be a new instance with the same values as the original
        assertEquals(calendar.getTimeInMillis(), clonedCalendar.getTimeInMillis());
    }
}
