package com.company;

public class Car extends Vehicle{
    public String modelName = "";      // car attribute

    public Car() {

    }

    public Car(String brandValue, String modelNameValue) {
        brand = brandValue;
        modelName = modelNameValue;
    }
}
