package com.example.iem.volkswagenapp.Model;

/**
 * Created by iem on 19/10/2016.
 */

public class MotorBike extends Vehicle {

    String adherenceMotorBike;

    public MotorBike() {
    }

    public MotorBike(String color, String modelName, int placeNumber) {
        super(color, modelName, placeNumber);
    }

    public MotorBike(String color, String modelName, int placeNumber, String adherenceMotorBike) {
        super(color, modelName, placeNumber);
        this.adherenceMotorBike = adherenceMotorBike;
    }

    @Override
    public String toString() {
        return super.toString()+"MotorBike{" +
                "adherenceMotorBike='" + adherenceMotorBike + '\'' +
                '}';
    }
}
