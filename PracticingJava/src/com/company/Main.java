package com.company;
import java.util.Scanner;

// import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello Angelina");

        String message = "Hello Angelina!";
        System.out.println(message);

//        int x, y, z; //declaring​
        int x = 5, y = 6, z = 50; //initializing​
        System.out.println(x + y + z);

        int myNumber = 15;
        myNumber = 20; // the value of myNumber is now 20​

        final int finalMyNumber = 10;
        System.out.println(finalMyNumber);


        //Widening casting

        int myInt = 10;
        double myDouble = myInt;
        System.out.println(myDouble);

        //Narrowing casting

        double newDouble = 15;
        int newInt = (int) newDouble;
        System.out.println(newInt);

        //String methods

        String text = "Angelina";
        System.out.println("The lenght of the text string is: " + text.length());  //Outputs: 8

        String txt = "Angelina";
        System.out.println(txt.toUpperCase()); //Outputs: ANGELINA
        System.out.println(txt.toLowerCase()); //Outputs: angelina
        System.out.println(txt.indexOf("g")); //Outputs: 2

        //String concatenation

        String name = "Angelina";
        String surname = "Stamatoska";
        System.out.println(name + " " + surname);
        System.out.println(name.concat(surname));
        System.out.println(String.join(" ", name, surname));


        int number1 = 1;
        int number2 = 5;
        int result = number1 + number2;
        System.out.println(result); //numbers are added

        String firstnumber = "1";
        String secondnumber = "5";
        String number3 = firstnumber + secondnumber;
        System.out.println(number3); //strings are concatenated

        // String - special characters

        String text1 = "We are the so-called \"Vikings\"from the north.";
        String text2 = "It\'s allright.";
        String text3 = "The character \\ is called backslash.";
        String text4 = "\tThe weather is sunny today.\n I should go out.";
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

        //Arithmetic operations

        int xnumber = 45;
        int ynumber = 10;
        System.out.println(xnumber % ynumber);

        System.out.println(++xnumber); //increment by 1
        System.out.println(--ynumber); //decrement by 1

        String newMessage = "The sum of 10 and 89 is: ";
        System.out.println(newMessage);
        int firstNumber = 10;
        double secondNumber = 89;
        System.out.println(firstNumber + secondNumber);


        message = "The subtraction of 100 and 9 is: ";
        System.out.println(message);
        int firstMyNumber = 100;
        int secondMyNumber = 9;
        System.out.println(firstMyNumber - secondMyNumber);

        message = "The division of 100 and 2 is: ";
        System.out.println(message);
        int firstNewNumber = 100;
        int secondNewNumber = 2;
        System.out.println(firstNewNumber / secondNewNumber);

        message = "The multiplication of 10 and 89 is:";
        System.out.println(message);
        System.out.println(firstNumber * secondNumber);

        message = "The divsion of " + secondNumber + " and " + firstNumber + " is";
        System.out.println(message);
        System.out.println(secondNumber - firstNumber);

        //Comparison operators

        int a = 14;
        int b = 7;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a > b);
        System.out.println(a < b);

        //Logical operators

        System.out.println(a < 14 && a < 7);
        System.out.println(a > 5 || a > 4);


    }
}





