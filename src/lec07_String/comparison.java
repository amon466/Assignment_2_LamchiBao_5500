package lec07_String;

public class comparison {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abc";
        String s4 = "def";
        String s5 = new String("abc");
        String s6 = new String("abc");
        String s7 = new String("ghk");

        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s5 == s6);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s5.equals(s6));
        System.out.println(s6.equals(s7));
 
    }

}
