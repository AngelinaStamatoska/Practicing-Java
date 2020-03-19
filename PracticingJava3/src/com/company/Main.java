package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Loops
        // For

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //Only print even values between 0 and 5

        for (int i = 0; i < 5; i = i + 2) {
            System.out.println(i);
        }


        //While

        //The code in the loop will run, over and over again, as long as a variable (i) is less than 5:


        int intNumber = 0;
        while (intNumber < 5) {
            System.out.println(intNumber);
            intNumber++;
        }


        // Do while

        int numberNew = 0;
        do {
            System.out.println(numberNew);
            numberNew++;
        }
        while (numberNew < 5);


        // Exercises with for, while and do while

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //Which two-digit numbers have a greater first digit than the second, and how many are there.​

        int firstDigit, secondDigit, total = 0;
        System.out.println("These two-digit numbers have a greater first digit:");

        for (int i = 10; i < 100; i++) {
            firstDigit = i / 10;
            secondDigit = i % 10;
            if (firstDigit > secondDigit) {
                System.out.println(i);
                total++;
            }
        }
        System.out.println("There are " + total + " two-digit numbers that have a greater first digit.");


        //        // Calculate the sum of all even numbers in a range of numbers.


        Scanner in = new Scanner(System.in);
        System.out.println("Begin with:");
        int firstNumber = in.nextInt();
        System.out.println("Ends with:");
        int secondNumber = in.nextInt();

        int newTotal = 0;

        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++)
            {
                if (i % 2 == 0)
                {
                    newTotal = newTotal +  i;

                }
            }
//             ex:i = 2;
//                newTotal = 0 + 2;
//
//                i = 3;
//                newTotal = 2;
//
//                i=4;
//                newTotal = 2 + 4;

            System.out.println("The total of the even numbers between "
                    + firstNumber + " and "
                    + secondNumber + " is "
                    + newTotal + ".");
        }
        else {
            System.out.println("Please input valid numbers");
        }

        ////Second way

        int minimum, maximum, evenSum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print(" Please Enter the Minimum value : ");
        minimum = input.nextInt();


        System.out.print(" Please Enter the Maximum value : ");
        maximum = input.nextInt();

        evenSum = sumOfEven(minimum, maximum);
        System.out.println("\n The Sum of Even Numbers from " + minimum + " to " + maximum + "  =  " + evenSum);


        //You are picking apples from a tree. One basket can hold 23 apples. How many baskets will you need for 100, 230 and 470 apples?


        System.out.println("Number of apples on tree:");
        int applesOnTree = in.nextInt();
        int applesInBasket = 23;

        int basketsNeeded = applesOnTree / applesInBasket;

        if (applesOnTree % applesInBasket > 0) {
            basketsNeeded++;
        }
        System.out.println("It takes " + basketsNeeded + " baskets to collect the apples from the tree");

        //        // Write a Java program to compute the sum of the digits of an integer.​


        System.out.print("Input an integer: ");
        int digits = in.nextInt();

        System.out.println("Digits e " + digits);
        System.out.println("The sum is " + sumDigits(digits));

    }

    public static int sumOfEven(int minimum, int maximum) {
        int i, sum = 0;

        for (i = minimum; i <= maximum; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;

    }
    public static int sumDigits(int number) {

        System.out.println("Number is " + number);

        int result = 0;

        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }

        return result;
    }
}

