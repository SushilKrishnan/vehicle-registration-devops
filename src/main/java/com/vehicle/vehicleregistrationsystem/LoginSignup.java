package com.vehicle.vehicleregistrationsystem;

public class LoginSignup {

    private String username;
    private String password;

    private VehicleRegistration registration;
    private VehicleLicensing licensing;

    public LoginSignup(String username,String password,
                       VehicleRegistration registration,
                       VehicleLicensing licensing) {

        this.username = username;
        this.password = password;
        this.registration = registration;
        this.licensing = licensing;
    }

    public void signUp() {
        System.out.println("User signed up : " + username);
    }

    public void login() {
        System.out.println("User logged in : " + username);

        registration.getDetails();
        licensing.provideLicense();
    }
}