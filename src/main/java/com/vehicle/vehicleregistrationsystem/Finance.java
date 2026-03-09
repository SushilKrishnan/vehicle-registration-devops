package com.vehicle.vehicleregistrationsystem;

public class Finance {

    private double rupeeBalance;
    private String database;

    public Finance(double balance,String database) {
        this.rupeeBalance = balance;
        this.database = database;
    }

    public void poolingOfFund() {
        System.out.println("Pooling funds from financial sources");
    }

    public void economicDevelopment() {
        System.out.println("Finance supports economic development");
    }

    public void betterDecisionMaking() {
        System.out.println("Finance helps in better decision making");
    }
}