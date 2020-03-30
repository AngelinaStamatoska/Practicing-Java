package com.angelina;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank nlbBank = new NLB();
        Bank sparkasseBank = new Sparkasse();
        Bank halkBank = new Halk();

        System.out.println(nlbBank.rateOfInterest());
        System.out.println(sparkasseBank.rateOfInterest());
        System.out.println(halkBank.rateOfInterest());



    }
}
