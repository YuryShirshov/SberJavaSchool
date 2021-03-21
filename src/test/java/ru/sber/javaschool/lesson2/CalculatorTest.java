package ru.sber.javaschool.lesson2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getSum() {
        assertEquals(10, calculator.getSum(4, 6), 0);
    }

    @Test
    public void getSubstraction() {
        assertEquals(10, calculator.getSubstraction(16, 6), 0);
    }

    @Test
    public void getMultiply() {
        assertEquals(10, calculator.getMultiply(2, 5), 0);
    }

    @Test
    public void getDivide() {
        assertEquals(10, calculator.getDivide(20, 2), 0);
    }

    @Test
    public void getMod() {
        assertEquals(0, calculator.getMod(20, 2), 0);
    }

    @Test
    public void getMax() {
        assertEquals(10, calculator.getMax(10, 2), 0);
    }

    @Test
    public void getMin() {
        assertEquals(10, calculator.getMin(10, 20), 0);
    }

    @Test
    public void isEquals() {
        assertTrue(calculator.isEquals(10, 10));
        assertFalse(calculator.isEquals(10, 20));
    }
}