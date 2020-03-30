package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


         //Java DooBeeDooBeeDo

            int x = 1;
            while (x < 3) {
                System.out.println("Doo");
                System.out.println("Bee");
                x = x + 1;
            }
            if (x ==3 ) {
                System.out.println("Do");
            }

        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                if (beerNum == 1) {
                    word = "bottle";
                }
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end else
        } // end while loop


        String[] pets = {"Fido", "Zeus", "Bin"};
        int petsNumber = pets.length;
        System.out.println(petsNumber);


        String s = pets[0]; // s is now the String “Fido”
        s = s + " " + "is a dog"; // s is now “Fido is a dog
        System.out.println(s);


        int xa = 3;
        while (xa > 0) {

            if (xa > 2) {

                System.out.print("a");
                xa = xa - 1;
                System.out.print("-");
            }
            if (xa == 2) {
                System.out.print("b c");
                xa = xa - 1;
                System.out.print("-");
            }

            if (xa == 1) {
                System.out.print("d");
                xa = xa - 1;
            }

        }

//        int xy = 1;
//        while ( xy < 10 ) {
//            if ( xy < 3) {
//                System.out.println(" \n big x");
//
//                xy++;
//            }
//        }

        int xp = 5;
        while (xp > 1) {
            xp = xp - 1;
            if (xp > 3) {
                System.out.println("\n small x");
            }
        }


        int xo = 0;
        int y = 0;
        while (xo < 5) {
            if( y < 5 ) {
                xo = xo + 1;
                if ( y < 3 ) {
                    xo = xo - 1;
                }
            }
            y = y + 2;

            System.out.print(xo +" " + y +" ");
            xo = xo + 1;
}

        int v = 2;
        while (v <= 10) {
            System.out.println(v);
            v += 2;
        }
    }





    }







