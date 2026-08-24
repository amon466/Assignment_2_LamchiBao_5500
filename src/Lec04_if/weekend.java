package Lec04_if;

import java.util.Scanner;

public class weekend {

    public static void switchcase(int num) {
        switch (num) {
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("thirday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("thusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("satuday");
                break;
            case 8:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invali value");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2-8");
        int number = scanner.nextInt();
        switchcase(number);
    }
}
