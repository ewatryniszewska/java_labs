package com.company.devices;

import com.company.creatures.Human;

import java.util.Date;

public class Transaction {
    public Human buyer;
    public Human seller;
    public Double price;
    public Date dateOfTransaction;

    public Transaction(Human buyer, Human seller, Double price, Date dateOfTransaction) {
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        this.dateOfTransaction = dateOfTransaction;
    }

    public String toString() {
        return "Seller (previous owner) is: " + this.seller + ", buyer (new owner): " + this.buyer +
                ", price of this car: " + this.price + ", transaction date: " + dateOfTransaction;
    }
}
