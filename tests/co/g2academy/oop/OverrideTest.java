package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverrideTest {

    @Test
    public void testMethodMoveOverriding() {
        Animal animal = new Animal();
        String actual = animal.move();
        String expected = "Animals can move";
        assertEquals(expected,actual);

        Animal mammal = new Mammal();
        actual = mammal.move();
        expected = "Mammals can move";
        assertEquals(expected, actual);
    }
}