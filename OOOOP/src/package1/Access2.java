package package1;

public class Access2 {
    public static void main(String [] args) {
        Access1 objA1 = new Access1();
        System.out.println(objA1.numPublic = 7);
        System.out.println(objA1.numProtected = 8);
        System.out.println(objA1.numDefault = 6);
    }
}
