package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;

    private Double salary = 1000.0;

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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (car.price <= salary) {
            System.out.println("Bravo, you bought a car for money.");
            this.car = car;
            return;
        }
        if (car.price <= 12 * salary) {
            System.out.println("You bought a car on hire purchise");
            this.car = car;
            return;
        }

        System.out.println("I'm sorry, you can't buy a car. You have no money for it.");
    }
}
