package com.example.iem.volkswagenapp.Model;

/**
 * Created by iem on 19/10/2016.
 */

public abstract class Vehicle {



String color,modelName;
    int placeNumber;

    public Vehicle() {
    }

    public Vehicle(String color, String modelName, int placeNumber) {
        this.color = color;
        this.modelName = modelName;
        this.placeNumber = placeNumber;
    }


    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getmodelName() {
        return modelName;
    }

    public void setmodelName(String modelName) {
        this.modelName = modelName;
    }

    public int getplaceNumber() {
        return placeNumber;
    }

    public void setplaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "color='" + color + '\'' +
                ", modelName='" + modelName + '\'' +
                ", placeNumber='" + placeNumber + '\'' +
                '}';
    }
}
