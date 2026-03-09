package com.vehicle.vehicleregistrationsystem;

public class VehiclePermit {

    protected String permitNumber;

    public VehiclePermit() {
        this.permitNumber = "PERMIT-001";
    }

    public void issuePermit() {
        System.out.println("Vehicle Permit Issued : " + permitNumber);
    }
}