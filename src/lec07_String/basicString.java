package lec07_String;

import java.util.Scanner;

public class basicString {

    private static String trimtext(String text) {
        return text.trim();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter line");
        String text = scanner.nextLine();
        String trimmed = trimtext(text);
        System.out.println("original length" + text.length());
        System.out.println("length after trim" + trimmed.length());
        System.out.println("upper" + text.toUpperCase());
        System.out.println("lower" + text.toLowerCase());
        System.out.println("original:[" + text + "]");
        System.out.println("original:[" + trimmed + "]");
    }
}
