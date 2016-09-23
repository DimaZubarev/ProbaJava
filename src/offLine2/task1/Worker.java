package offLine2.task1;


import offLine2.task1.Person;

public class Worker extends Person {

    protected String address;
    protected double salary;

    public Worker(String gender, String firstName, String secondName, int age, String address, double salary) {
        super(gender, firstName, secondName, age);
        this.address = address;
        this.salary = salary;
    }
    public double getSalary(){return salary;}
}
