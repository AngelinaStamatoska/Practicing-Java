package com.angelina;

public class Car {
    public String color;
    public int yearOfProduction;

    public Car(String colorValue, int yearOfProductionValue) {
        color = colorValue;
        yearOfProduction = yearOfProductionValue;
    }



    public double fuelConsumption(double x, double y, double z) {
//        int x = 5;
//        int y = 100;
//        int z = 70;
        return ((x / y) * z);
    }

    public void print() {

        System.out.println("The color of the car is " + color);
        System.out.println("The year of production is " + yearOfProduction);
        System.out.println("The fuel consumption is " + fuelConsumption(5, 100, 70) + " denars");

    }
    }
