package co.g2academy.oop;

public class Salary extends Employee{

    private double salary; // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public String mailCheck() {
        return "Within mailCheck of Salary class " + "Mailing check to " +
                getName() + " with salary " + salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }

}
