package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal dog = new Pet("dog");
        dog.name = "Akita";

        Animal chicken = new FarmAnimal("chicken");
        chicken.name = "Koko";

        Human me = new Human(3, 4);

        me.firstName = "Ewa";
        me.lastName = "Tryniszewska";
        me.pet = new FarmAnimal("chicken");

        me.pet = dog;
        me.pet.feed();
        me.pet.takeAWalk();

        Car myCar = new Diesel("Opel", 1000.0, "Astra", 2006);
        myCar.registrationNumber = "GD9785";
        myCar.color = "Red";
        myCar.price = 1500.0;

        me.setCar(myCar, 0);

        Human myHusband = new Human();
        myHusband.firstName = "Imie meza";
        myHusband.lastName = "Nazwisko meza";
        myHusband.setCar(myCar, 0);

        System.out.println(me);
        System.out.println(myHusband);
        System.out.println(dog);
        System.out.println(myCar);

        Human person = new Human(2, 3);
        person.firstName = "Buyer";

        me.pet.sell(person, me, 600.0);
        person.pet.sell(person, me, 600.0);
        me.sell(person, me, 1500.0);

        me.phone = new Phone("Samsung", "Galaxy", 2015);
        me.phone.sell(person, me, 1500.0);

        person.pet.feed();
        person.pet.feed();
        me.feed();
        me.feed();
        chicken.feed();

        String[] apps = {"facebook", "skype", "instagram"};
        try {
            person.phone.installAnApp(apps);
            person.phone.installAnApp("Myapp", "1.2");
            person.phone.installAnApp("Appname", "1.0", new ServerInfo("https", "myownappserver.com", 443));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Car otherCar = new Electric("Tesla", 0.0, "3", 2018);
        otherCar.price = 2000.0;
        me.setCar(otherCar, 1);
        otherCar.refuel();
        myCar.refuel();

        me.setCar(new LPG("Audi", 1800.0, "A4", 1993), 2);
        me.getCar(2).price = 650.0;
        me.getCar(2).refuel();

        Scanner in = new Scanner(System.in);

        me.farm[0] = new FarmAnimal("horse", 1000.0);
        me.farm[1] = new FarmAnimal("chicken", 5.0);
        me.farm[2] = new FarmAnimal("cow", 1300.0);

        Arrays.sort(me.farm);

        System.out.println(Arrays.toString(me.farm));

        System.out.println("Total price all of cars in garage: " + me.sumPricesOfAllCars());

        System.out.println("Cars in garage: " + Arrays.toString(me.getGarage()));
        me.sortCars();
        System.out.println("Cars sorted: " + Arrays.toString(me.getGarage()));

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(person.getGarage()));

        me.getCar(0).sell(person, me, 800.0);

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(person.getGarage()));
    }
}
