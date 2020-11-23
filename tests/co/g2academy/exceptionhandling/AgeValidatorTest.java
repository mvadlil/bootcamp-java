package co.g2academy.exceptionhandling;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeValidatorTest {

    AgeValidator validator = new AgeValidator();

    @Test
    public void testValidAgeValidator() {
        boolean actual = validator.validate(25);
        assertTrue(actual);
    }
}