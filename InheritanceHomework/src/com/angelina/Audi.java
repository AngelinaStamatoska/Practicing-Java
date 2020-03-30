package com.angelina;

public class Audi extends Car {

    public int numDoors;

    public Audi(String colorValue, int yearOfProductionValue, int numDoorsValue) {
        super(colorValue, yearOfProductionValue);
       numDoors = numDoorsValue;

    }

    public void print() {

        super.print();
        System.out.println("The number of doors is " + numDoors);

    }
}

