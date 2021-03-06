package co.g2academy.basic;

public class ThisExample {

    int num;

    ThisExample() {
        System.out.println("This is and example program on keyword this");
    }

    ThisExample(int num){
        //invoking the default constructor
        this();
        //assigning local variable num to the instance variable num
        this.num = num;
    }

    public void greet() {
        System.out.println("Hi Welcome to JAVA");
    }

    public void print() {
        // Local variable num
        int num = 20;
        // Printing the local variable
        System.out.println("value of local variable num is : " + num);
        // Printing the instance variable
        System.out.println("value of instance variable num is : " + this.num);
        // Invoking the greet method of a class
        this.greet();
    }

    public static void main(String[] args) {
        // Instantiating the class
        ThisExample obj1 = new ThisExample();
        // Invoking the print method
        obj1.print();
        // Passing a new value to the num variable through parametrized constructor
        ThisExample obj2 = new ThisExample(30);
        // Invoking the print method again
        obj2.print();
        //
        obj1 = obj2;
    }

}
