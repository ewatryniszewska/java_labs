package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.YearOfProductionComparator;

import java.util.Arrays;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;

    private static final Integer DEFAULT_GARAGE_SIZE = 1;
    private Double salary = 1000.0;
    private Double cash = 3000.0;

    private static final Integer DEFAULT_FARM_SIZE = 4;
    private Car[] garage;

    public FarmAnimal[] farm;

    public Human() {
        super("Homo sapiens");
        this.weight = 58.0;
        this.farm = new FarmAnimal[DEFAULT_FARM_SIZE];
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer farmSize, Integer garageSize) {
        super("Homo sapiens");
        this.weight = 58.0;
        this.farm = new FarmAnimal[farmSize];
        this.garage = new Car[garageSize];
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

    public Car getCar(Integer index) {
        if (index >= 0 && index <= this.garage.length - 1) {
            return garage[index];
        }
        System.out.println("There is no such place in the garage.");
        return null;
    }

    public void setCar(Car car, Integer index) {
        if (index >= 0 && index <= this.garage.length - 1) {
            this.garage[index] = car;
            if (car != null) {
                car.addTransaction(this);
            }
            return;
        }
        System.out.println("There is no such place in the garage.");
    }

    public Car[] getGarage() {
        return garage;
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
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        System.out.println("Are you joking? It's no way for this.");
    }

    public Double sumPricesOfAllCars() {
        Double sum = 0.0;
        for (int i = 0; i < garage.length; i++) {
            if (getCar(i) != null) {
                sum += getCar(i).price;
            }
        }
        return sum;
    }

    public void sortCars() {
        Arrays.sort(getGarage(), new YearOfProductionComparator());
    }

    public Integer carsPlaceInGarage(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (car == getCar(i)) {
                return i;
            }
        }
        return null;
    }

    public Integer firstEmptyPlace() {
        for (int i = 0; i < garage.length; i++) {
            if (getCar(i) == null) {
                return i;
            }
        }
        return null;
    }
}

