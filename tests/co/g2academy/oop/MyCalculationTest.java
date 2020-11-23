package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculationTest {

    @Test
    public void testAddition() {
        MyCalculation calculation = new MyCalculation();
        calculation.addition(10, 10);
        int actual = calculation.z;
        assertEquals(20, actual);
    }

    @Test
    public void testSubstraction() {
        MyCalculation calculation = new MyCalculation();
        calculation.subtraction(10, 3);
        int actual = calculation.z;
        assertEquals(7, actual);
    }

    @Test
    public void testMultiplication() {
        MyCalculation calculation = new MyCalculation();
        calculation.multiplication(10, 3);
        int actual = calculation.z;
        assertEquals(30, actual);
    }


}