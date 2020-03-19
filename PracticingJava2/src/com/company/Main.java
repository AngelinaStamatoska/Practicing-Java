package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // If - else statements
        // Test two variables to find out if 20 is greater than 18. If the condition is true, print some text

        int b = 20;
        int c = 18;

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }


        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");  //Outputs: Good evening.
        }
        /* In the example above, time (20) is greater than 18, so the condition is false.
        Because of this, we move on to the else condition and print to the screen "Good evening".
         If the time was less than 18, the program would print "Good day". */

        /*There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
        It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:
         */

        int newTime = 25;
        String result = (newTime < 15) ? "Good day" : "Good evening";
        System.out.println(result);

        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 20) {
            System.out.println("Good afternoon.");
        } else {
            System.out.println("Good evening."); //Outputs: Good evening.
        }

        /*In the example above, time (22) is greater than 10, so the first condition is false.
         The next condition, in the else if statement, is also false,
         so we move on to the else condition since condition1 and condition2 is both false - and print to the screen "Good evening".
         */


        //if - else exercises with conditions

        int user = 21;
        if (user <= 18) {
            System.out.println("User is 18 or younger");
        } else if (user > 18 && user < 40) {
            System.out.println("User is between 19 and 39");
        } else {
            System.out.println("User is older than 40");
        }


        //Exersise: Write a Java program to test if a number is positive or negative.​

        int numberNum = 14;
        if (numberNum > 0) {
            System.out.println("The number is positive.");
        } else if (numberNum < 0) {
            System.out.println("The numbers is negative.");
        } else {
            System.out.println("The number is zero.");
        }


        // Exersise: Take three numbers from the user and print the greatest number.​

        int num1 = 15;
        int num2 = 10;
        int num3 = 5;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest number is:" + num1);
            } else {
                System.out.println("The greatest number is:" + num3);
            }
        } else if (num1 < num2) {
            System.out.println("The greatest number is:" + num2);
        } else {
            System.out.println("The greates number is:" + num3);
        }


        int newUser = 45;
        if (newUser <= 18) {
            System.out.println("User is 18 or younger");
        } else if (newUser > 18 && newUser < 40) {
            System.out.println("User is between 19 and 39");
        } else if (newUser == 45 || newUser == 50) {
            System.out.println("User is either 45 OR 50");
        } else {
            System.out.println("User is older than 40");
        }


        int grade = 91;
        if (grade <= 50) {
            System.out.println("You shall not pass!");
        } else if (grade > 50 && grade < 61) {
            System.out.println("You have E.");
        } else if (grade >= 61 && grade <= 70) {
            System.out.println("You have D.");
        } else if (grade >= 71 && grade <= 80) {
            System.out.println("You have C.");
        } else if (grade >= 81 && grade <= 90) {
            System.out.println("You have B.");
        } else {
            System.out.println(" Well done, you have A.");
        }


        int number = 13;
        if ((number % 2) == 0) {
            System.out.println(number + " " + "is even");
        } else {
            System.out.println(number + " " + "is odd");

        }

        //Switch

        int studentsPoints = 88;
        char studentsGrade = 'F';
        if (studentsPoints > 51 && studentsPoints < 61) {
            studentsGrade = 'E';
        } else if (studentsPoints >= 61 && studentsPoints < 71) {
            studentsGrade = 'D';
        } else if (studentsPoints >= 71 && studentsPoints < 81) {
            studentsGrade = 'C';
        } else if (studentsPoints >= 81 && studentsPoints < 91) {
            studentsGrade = 'B';
        } else if (studentsPoints >= 91 && studentsPoints < 100) {
            studentsGrade = 'A';
        } else if (studentsPoints >= 101) {
            studentsGrade = 'Z';
        }

        switch (studentsGrade) {
            case 'F':
                System.out.println("The students gets the grade: " + studentsGrade);
                break;
            case 'E':
                System.out.println("The students gets the grade: " + studentsGrade);
                break;
            case 'D':
                System.out.println("The students gets the grade: " + studentsGrade);
                break;
            case 'C':
                System.out.println("The students gets the grade: " + studentsGrade);
                break;
            case 'A':
                System.out.println("The students gets the grade: " + studentsGrade);
                break;
        }

        String weather = "Sunny";
        switch (weather) {
            case "Sunny":
                System.out.println("I will not take my umbrella");
                break;
            case "Rain":
                System.out.println("I will take my umbrella");
                break;
            case "Snowy":
                System.out.println("I will take my coat");
                break;
            default:
                System.out.println("I do not know the weather");
                break;

        }


        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusrday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }   //Outputs: Thursday
    }
}