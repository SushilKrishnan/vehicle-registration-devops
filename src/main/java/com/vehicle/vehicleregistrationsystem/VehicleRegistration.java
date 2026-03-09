package com.vehicle.vehicleregistrationsystem;

public class VehicleRegistration extends VehiclePermit {

    private String vehicleNumber;
    private String owner;

    private Finance finance;

    public VehicleRegistration(String vehicleNumber,String owner,Finance finance) {

        this.vehicleNumber = vehicleNumber;
        this.owner = owner;
        this.finance = finance;
    }

    public void registerVehicle() {

        System.out.println("Vehicle Registered : " + vehicleNumber);

        issuePermit();

        finance.poolingOfFund();
    }

    public void getDetails() {

        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner : " + owner);
    }

    public void verifyDetails() {

        System.out.println("Verification completed for " + vehicleNumber);
    }
}