package Lec04_if;

import java.util.Scanner;

public class ballon {

    public static int many(String value) {
        switch (value) {
            case "monday ":return 2;
            case " tuseday":return 3;
            case "wednessday":return 4;
            case "thusday":return 5;
            case "friday":return 6;
            case "satuday":return 7;
            case "sunday":return 8;
            default:return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tu thu hai den chu nhat");
        String daily = scanner.nextLine();
        many(daily);
    }
}
