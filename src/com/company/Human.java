package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;

    private Double salary = 1000.0;

    public Human() {
        super("Homo sapiens");
    }

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

    public String toString() {
        return "Human " + this.firstName + " " + this.lastName;
    }

    @Override
    public void sell() {
        System.out.println("Are you joking? It's no way for this.");
    }
}

