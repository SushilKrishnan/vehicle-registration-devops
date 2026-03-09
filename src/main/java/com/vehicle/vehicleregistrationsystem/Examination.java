package com.vehicle.vehicleregistrationsystem;

public class Examination {

    protected String name;
    protected String signature;

    public Examination(String name,String signature) {
        this.name = name;
        this.signature = signature;
    }

    public void figureOutEligibleCandidate() {
        System.out.println("Exam conducted for " + name);
        System.out.println("Signature verified : " + signature);
    }
}