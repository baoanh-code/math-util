package com.admin.mathutil.core.test;

import com.admin.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilTest {

    // Test Case #1: Check getFactorial with n = 0 -> Expected: 1
    @Test
    public void testGetFactorialGivenRightArgument0ReturnsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    // Test Case #2: Check getFactorial with n = 5 -> Expected: 120
    @Test
    public void testGetFactorialGivenRightArgument5ReturnsWell() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    // Test Case #3: Check getFactorial with n = 6 -> Expected: 720
    @Test
    public void testGetFactorialGivenRightArgument6ReturnsWell() {
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    // Test Case #4: Check getFactorial with n = -1 -> Expected: IllegalArgumentException
    @Test
    public void testGetFactorialGivenWrongArgumentMinus1ThrowsException() {
        int n = -1;
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(n));
    }
}