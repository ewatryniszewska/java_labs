package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;

    private Double salary = 100.0;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Sorry, I will not pay for my own job");
        } else {
            System.out.println("Your salary is now: " + salary);
            this.salary = salary;
        }
    }
}
