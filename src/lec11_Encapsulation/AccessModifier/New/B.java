
package lec11_Encapsulation.AccessModifier.New;

import lec11_Encapsulation.AccessModifier.Old.A;

public class B {
    public static int publicB=1;
    protected static int protectedB=2;
    static int defaultB=3;
    private static int privateB=4;
    
    public static void printVariable(){
        System.out.println(publicB);
        System.out.println(protectedB);
        System.out.println(defaultB);
        System.out.println(privateB);
        System.out.println(A.publicA);
    }
    public static void main(String[] args) {
        B.printVariable();
    }
}
