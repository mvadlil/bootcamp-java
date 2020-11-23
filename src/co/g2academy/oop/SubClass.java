package co.g2academy.oop;

public class SubClass extends SuperClass {
    int num = 10;

    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }
    public void myMethod() {
        // Instantiating subclass
        SubClass sub = new SubClass();

        // Invoking the display() method of sub class
        this.display();

        // Invoking the display() method of superclass
        super.display();

        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:"+ this.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:"+ super.num);
    }

    public static void main(String[] args) {
        // anonymous object
        new SubClass().myMethod();
    }

}
