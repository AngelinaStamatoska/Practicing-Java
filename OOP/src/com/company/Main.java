package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();


        Car mustang = new Car("Ford", "Mustang");

        //Call the honk() method (from the vehicle class)
        //on the car object
        mustang.honk();

        //Display the value od the brand attribute
        // from the vehicle class and the value of the modelname
        System.out.println(mustang.brand + " " + mustang.modelName);

        Dog husky1 = new Dog();
        Dog poodle1 = new Dog();
        Dog germanShepherd1 = new Dog("German Shepherd", "Rex" );
        System.out.println(germanShepherd1.getdogName());
        System.out.println(germanShepherd1.getHungerState());
        germanShepherd1.feed();
        System.out.println(germanShepherd1.getHungerState());
        husky1.setDogName("Doggie");
        System.out.println(poodle1.getdogName());

        poodle1.setDogName("Princess");
        System.out.println(poodle1.getdogName());

        System.out.println(husky1.getHungerState());
        poodle1.feed();
        System.out.println(poodle1.getHungerState());

        husky1.fetch();
        poodle1.wagTail();


    }
}
