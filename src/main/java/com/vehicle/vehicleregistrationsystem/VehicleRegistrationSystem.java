package com.vehicle.vehicleregistrationsystem;

public class VehicleRegistrationSystem {

    public static void main(String[] args) {

        Finance finance = new Finance(100000,"CentralDB");

        VehicleRegistration registration =
                new VehicleRegistration("TN10AB1234","Rahul",finance);

        VehicleLicensing licensing =
                new VehicleLicensing("Rahul","OfficerSign",22,"Chennai",finance);

        LoginSignup user =
                new LoginSignup("Rahul","1234",registration,licensing);

        user.signUp();
        user.login();

        registration.registerVehicle();
        registration.verifyDetails();
    }
}