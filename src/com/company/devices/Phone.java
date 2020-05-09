package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class Phone extends Device {
    private static final String DEFAULT_SERVER_ADDRESS = "myserver.net";
    private static final String DEFAULT_PROTOCOL = "http";
    private static final Integer DEFAULT_PORT = 80;


    public Phone(String brand, String model) {
        super(brand, model);
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
    public void sell(Human buyer, Human seller, Double price) {
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
}
