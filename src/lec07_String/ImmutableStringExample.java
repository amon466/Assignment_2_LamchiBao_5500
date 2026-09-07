package lec07_String;

public class ImmutableStringExample {

    public static void main(String args[]) {
        String s = " Duy Tan ";
        s = s.concat(" University");
        System.out.println(s);
    }
}