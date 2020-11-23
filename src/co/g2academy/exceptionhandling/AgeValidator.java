package co.g2academy.exceptionhandling;

public class AgeValidator {

    public boolean validate(int age){
        if(age<18) {
            throw new ArithmeticException();
        } else {
            return true;
        }
    }
}
