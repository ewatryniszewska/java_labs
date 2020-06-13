package com.company.devices;

public class Application {
    public String name;
    public String version;
    public Double price;

    public Application(String appName, String version, Double priceApp) {
        this.name = appName;
        this.version = version;
        this.price = priceApp;
    }

    public String toString() {
        return this.name + " version: " + this.version + " price: " + this.price;
    }
}
