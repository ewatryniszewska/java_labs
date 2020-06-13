package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Phone extends Device {
    public Set<Application> applicationSet;

    private static final String DEFAULT_SERVER_ADDRESS = "myserver.net";
    private static final String DEFAULT_PROTOCOL = "http";
    private static final Integer DEFAULT_PORT = 80;


    public Phone(String brand, String model, Integer yearOfProduction) {
        super(brand, model, yearOfProduction);
        applicationSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Phone" + this.brand + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is on.");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if ((buyer.getCash() >= price) && Objects.nonNull(seller.phone)) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Buyer bought a phone: " + buyer.phone + ". Buyer now has " + buyer.getCash());
            System.out.println("Seller sold a phone, and have nothing: " + seller.phone +
                    ". Seller now has " + seller.getCash());
        } else {
            System.out.println("Seller can't sell a phone and buyer can't buy.");
        }
    }

    public void installAnApp(String appName) throws MalformedURLException {
        installAnApp(appName, "latest");
    }

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(String appName, String version) throws MalformedURLException {
        URL url = new URL(DEFAULT_PROTOCOL, DEFAULT_SERVER_ADDRESS, DEFAULT_PORT, appName + "-" + version);
        installAnApp(url);
    }

    public void installAnApp(String appName, String version, ServerInfo serverInfo) throws MalformedURLException {
        URL url = new URL(serverInfo.protocol, serverInfo.address, serverInfo.port, appName + "-" + version);
        installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("App " + url.getFile() + " was installed");
    }

    public void installAnApp(String appName, String appVersion, Double appPrice, Human owner) {
        if (owner.getCash() >= appPrice) {
            applicationSet.add(new Application(appName, appVersion, appPrice));
            owner.setCash(owner.getCash() - appPrice);
            System.out.println(appName + " was installed.");
            return;
        }
        System.out.println("You have not enough money to buy this app.");
    }

    public void isAppInstalled(Application app) {
        isAppInstalled(app.name);
    }

    public void isAppInstalled(String appName) {
        for (Application app : applicationSet) {
            if (app.name.equals(appName)) {
                System.out.println(appName + " was installed.");
                return;
            }
        }
        System.out.println(appName + " wasn't installed.");
    }

    public void freeApp() {
        int i = 0;
        for (Application app : applicationSet) {
            if (app.price == 0.0) {
                System.out.println(app);
                i++;
            }
        }
        if (i == 0) {
            System.out.println("There is no application for free");
        }
    }

    public Double valueOfApp() {
        Double sum = 0.0;
        for (Application app : applicationSet) {
            if (app.price > 0.0) {
                sum += app.price;
            }
        }
        return sum;
    }

    public Application[] alphabeticAppSort() {
        Application[] appList = new Application[applicationSet.size()];
        applicationSet.toArray(appList);
        Arrays.sort(appList, new NamePhoneAppComparator());
        System.out.println(Arrays.toString(appList));
        return appList;
    }

    public Application[] priceAppSort() {
        Application[] appList = new Application[applicationSet.size()];
        applicationSet.toArray(appList);
        Arrays.sort(appList, new PricePhoneAppComparator());
        System.out.println(Arrays.toString(appList));
        return appList;
    }
}
