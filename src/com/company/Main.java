package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        Animal lion = new Animal("lion");
        lion.name = "Leo";

        Human me = new Human();
        me.firstName = "Ewa";
        me.lastName = "Tryniszewska";
        me.pet = new Animal("lion");

        me.pet = dog;
        me.pet.feed();
        me.pet.takeAWalk();

        me.setCar(new Car("Opel", 1000.0, "Astra"));
        me.getCar().registrationNumber = "GD9785";
        me.getCar().color = "Red";

        System.out.println(me.getCar().brand + " " + me.getCar().model + " " + me.getCar().engine + " "
                + me.getCar().color + " " + me.getCar().registrationNumber);

        System.out.println("I earn " + me.getSalary());
        me.setSalary(1500.0);
    }
}
