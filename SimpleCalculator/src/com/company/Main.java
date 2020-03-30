package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Making a calculator

        Scanner in = new Scanner(System.in);
        double firstNumber = 0.00d;
        double secondNumber = 0.00d;
        double result = 0.00d;

        System.out.println("Please enter the first number!");
        firstNumber = in.nextDouble();
        System.out.println("Please enter the second number!");
        secondNumber = in.nextDouble();

        System.out.println("Please enter an operation to compute these numbers!");
        String operation = in.next();
        operation = Validation(operation);
//        Validation(operation);

        ComputeResult(operation, firstNumber, secondNumber, result);




        MyMethod(5, 5 );
        int z = MyMethod (5, 5);
        System.out.println(z); //z:10
        System.out.println(myMethodOne(3));  //Outputs 8 (5+3)
        }


        public static String Validation (String operation) {
            Scanner in = new Scanner(System.in);
            String[] operationOptions = {"+", "-", "*", "/", "Add", "Sub", "Mul", "Div"};

            boolean isOperationValid = false;

            while (!isOperationValid) {
                for (int i = 0; i < operationOptions.length; i++) {
                    if (operationOptions[i].equals(operation)) {
                        isOperationValid = true;
                        break;
                    }
                }
                if (isOperationValid == false) {
                    System.out.println("You have entered an invalid operation!");
                    System.out.println("Please enter a valid operation!");
                    operation = in.next();
                } else {
                    break;
                }
            }
            return operation;
        }

        public static void ComputeResult(String operation, double firstNumber, double secondNumber, double result){
            switch (operation) {
                case "+":
                case "Add":
                    result = firstNumber + secondNumber;
                    System.out.println("The summation of the two numbers is: " + result);
                    break;
                case "-":
                case "Sub":
                    result = firstNumber - secondNumber;
                    System.out.println("The substraction of the two numbers is: " + result);
                    break;
                case "*":
                case "Mul":
                    result = firstNumber * secondNumber;
                    System.out.println("The multiplication of the two numbers is: " + result);
                    break;
                case "/":
                case "Div":
                    result = firstNumber / secondNumber;
                    System.out.println("The division of the two numbers is: " + result);
                    break;
                default:
                    System.out.println("You have entered an invalid operation!");
                    break;
            }

        }


         public static int myMethodOne(int x) {
                return 5 + x;
           }
           public static int MyMethod(int x, int y) {
            return x + y;
           }


            }



