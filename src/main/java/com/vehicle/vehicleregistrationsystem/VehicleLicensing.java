package com.vehicle.vehicleregistrationsystem;

public class VehicleLicensing extends Examination {

    private int age;
    private String address;

    private Finance finance;

    public VehicleLicensing(String name,String signature,int age,String address,Finance finance) {

        super(name,signature);
        this.age = age;
        this.address = address;
        this.finance = finance;
    }

    public void provideLicense() {

        figureOutEligibleCandidate();

        if(age >= 18) {
            System.out.println("License issued to " + name);
        } else {
            System.out.println("Candidate not eligible");
        }

        finance.betterDecisionMaking();
    }
}