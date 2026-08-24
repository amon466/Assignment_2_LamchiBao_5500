package Lec04_if;

import java.util.Scanner;

public class caculartor {

    public static void method(float a, float b, int choice) {
        switch (choice) {
            case 1:
                System.out.println("a+b=" + (a + b));
                break;
            case 2:
                System.out.println("a-b" + (a - b));
                break;
            case 3:
                System.out.println("a*b" + (a * b));
                break;
            case 4:
                System.out.println("a/b" + a / b);
                break;
            default:
                System.out.println("ivandly value");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        float a = scanner.nextFloat();
        System.out.println("enter b");
        float b = scanner.nextFloat();
        System.out.println("enter 1/cong ; 2/tru ;3/nhan; 4/chia ");
        int choice = scanner.nextInt();
        method(a, b, choice);
    }
}
