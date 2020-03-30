package com.angelina;

public class Main {

    public static void main(String[] args) {
	// write your code here

            //Java Arrays

            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

            // or integer

            int[] myNum = {10, 20, 30, 40, 50};

            //Access the elements of an array
            String[] carsOne = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars[0]);


            //Change an Array element

            String[] names = {"Angelina", "Frosina", "Marija", "Dimce"};
            names[3] = "Martin";
            System.out.println(names[3]);

            //Array Length

            String[] myNames = {"Angelina", "Frosina", "Marija", "Dimce"};
            System.out.println(names.length);


            // Loop through an array

            String[] newCars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }


            // Loop through an Array with for each

            String[] surnames = {"Stamatoska", "Mocanoski"};
            for (String i : surnames) {
                System.out.println(i);
            }

            //Multidimensional arrays


            int [][] myNumbers = { {1,2,3,4}, {5,6,7}};

            //to access the elements of the myNumbers, specify two indexes:

            int x = myNumbers [1][2];
            System.out.println(x);

            //Use for loop, inside another for loop to get the elements

            int[][] myNewNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int i = 0; i < myNewNumbers.length; ++i) {
                for(int j = 0; j < myNewNumbers[i].length; ++j) {
                    System.out.println(myNewNumbers[i][j]);
                }
            }


            char[] greeting = {'M', 'o', 'r', 'n', 'i', 'n', 'g'};
            String word = "";
            for (int t = 0; t < greeting.length; t++) {
                word += greeting[t];
            }
            System.out.println(word);


            for (int index = 0; index < 5; index++) {
                if (index == 2) {
                    break;
                }
                System.out.println(index);

            }

            String[] fiveNames = new String[5];
            names[0] = "Angelina";
            names[1] = "Frosina";
            names[2] = "Martin";
            names[3] = "Olivera";
            names[4] = "Vecko";

            int i = 0;

            while (i < fiveNames.length) {
                System.out.println(fiveNames[i]);
                i++;
            }


            int[] companyDepartment = new int[3];
            companyDepartment[0] = 5;
            companyDepartment[1] = 7;
            companyDepartment[2] = 9;
            int employees = 0;

            for (int a = 0; a < companyDepartment.length; a++) {
                employees += companyDepartment[a];

            }
            System.out.println(employees);


            int[] students = new int[3];
            students[0] = 10;
            students[1] = 15;
            students[2] = 20;
            int sum = 0;
            for (int group : students) {
                sum += group;
            }
            int totalPlacesLeft = 60 - sum;
            System.out.println("The total number of students is " + sum);

            if (sum >= 60) {
                System.out.println("There is no more space in the groups");
            } else {
                for (int c = 0; c < students.length; c++) {
                    int groupNumber = c + 1;
                    if (students[c] != 20) {
                        int placesLeft = 20 - students[c];
                        System.out.println("Number of students in group [" + groupNumber + "] is  " + students[c] + ". Another " + placesLeft + " students can enroll in this group. ");
                    } else {
                        System.out.println("There are no more available places in group [" + groupNumber + "]. ");
                    }
                }

            }
        }
    }

