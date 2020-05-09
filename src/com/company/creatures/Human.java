package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;

    private Car car;
    private Double salary = 1000.0;
    private Double cash = 3000.0;

    public Human() {
        super("Homo sapiens");
        this.weight = 58.0;
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
        this.car = car;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public String toString() {
        return "Human " + this.firstName + " " + this.lastName;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        System.out.println("Are you joking? It's no way for this.");
    }
}

