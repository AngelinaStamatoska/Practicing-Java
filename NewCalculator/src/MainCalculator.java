public class MainCalculator {

    public static void main (String [] args) {

        System.out.println("The summation of 10 and 20 is: " +Calculator.addMethod(10,20));
        System.out.println("The substraction of 30 and 15 is: " + Calculator.subMethod(30,15));

        Calculator objCalc = new Calculator();
        System.out.println("The multiplicatuion of 9 and 6 is: " + objCalc.mulMethod(9,6));
        System.out.println("The divsion of 9 and 6 is: " + objCalc.divMethod(9,6));
    }
}
