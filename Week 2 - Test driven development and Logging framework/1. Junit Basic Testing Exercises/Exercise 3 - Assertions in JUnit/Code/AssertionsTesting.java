package com.example.junit_basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTesting {

	@Test
    public void testEquals() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public void testTrue() {
        boolean isAdult = (20 >= 18);
        assertTrue(isAdult);
    }

    @Test
    public void testFalse() {
        boolean isMinor = (16 >= 18);
        assertFalse(isMinor);
    }

    @Test
    public void testNull() {
        String name = null;
        assertNull(name);
    }

    @Test
    public void testNotNull() {
        String city = "Kolkata";
        assertNotNull(city);
    }

    @Test
    public void testSame() {
        String str = "Hello";
        String sameStr = str;
        assertSame(str, sameStr);
    }

    @Test
    public void testNotSame() {
        String a = new String("Test");
        String b = new String("Test");
        assertNotSame(a, b);
    }

}
