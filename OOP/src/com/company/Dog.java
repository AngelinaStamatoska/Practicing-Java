package com.company;

public class Dog extends Animal {
    private String breed = "";
    private String color = "";
    private String name = "";
    private boolean isHungry = true;

    public void animalSound() {
        System.out.println("The dog says: bow wow!");
    }
    public Dog() {

    }
    public Dog(String breedValue, String nameValue) {
        breed = breedValue;
        name = nameValue;

    }

    public void bark(){
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching a branch!");
    }

    public void wagTail() {
        System.out.println(name + " is wagging its tail!");
    }

    public String getdogName() {
        return name;
    }

    public void setDogName(String nameValue){
        name = nameValue;
    }

    public String getHungerState(){
if (isHungry) {
return name + "is hungry.";
}
else {
return name + " isn't hungry.";
}
}

public void feed () {
isHungry = false;
}
}