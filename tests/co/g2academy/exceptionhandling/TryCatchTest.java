package co.g2academy.exceptionhandling;

import org.junit.Test;

public class TryCatchTest {
    @Test
    public void testArithmeticException() {
        int data=50/0;//may throw exception
        System.out.println("rest of the code...");
    }
}
