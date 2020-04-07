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

        Car myCar = new Car("Opel", 1000.0, "Astra");
        myCar.registrationNumber = "GD9785";
        myCar.color = "Red";

        me.setCar(myCar);

        Human myHusband = new Human();
        myHusband.firstName = "Imie meza";
        myHusband.lastName = "Nazwisko meza";
        myHusband.setCar(myCar);

        System.out.println(me);
        System.out.println(myHusband);
        System.out.println(dog);
        System.out.println(myCar);
    }
}
