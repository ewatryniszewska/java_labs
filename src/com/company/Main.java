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

        me.car = new Car("Opel", 1000.0, "Astra");
        me.car.registrationNumber = "GD9785";
        me.car.color = "Red";

        System.out.println(me.car.brand + " " + me.car.model + " " + me.car.engine + " " + me.car.color);
    }
}
