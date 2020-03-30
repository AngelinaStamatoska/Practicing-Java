package package2;
import package1.Access1;

public class Access4 extends Access1 {
    public static void main (String [] args) {
        Access4 objA4 = new Access4();
        System.out.println(objA4.numPublic = 8);
        System.out.println(objA4.numProtected =2);

    }
}
