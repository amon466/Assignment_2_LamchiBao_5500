package lec07_String;

public class simple11 {

    public static void main(String args[]) {
        String s = "Sachin";
        String str1 = new String("Hello Java");
        String str2 = "Hello Java";
        String str3 = str2.intern();
        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1 == str3 " + (str1 == str3));
        System.out.println("str2 == str3 " + (str2 == str3));
        System.out.println(s.charAt(0));//S
        System.out.println(s.charAt(3));//h
        System.out.println(s.length());
        System.out.println("str1==str2");
    }

}
