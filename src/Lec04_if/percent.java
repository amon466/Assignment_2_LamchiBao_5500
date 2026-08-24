package Lec04_if;

import java.util.Scanner;

public class percent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("what precent did you earn");
        int percent = scanner.nextInt();
        if (percent >= 90) {
            System.out.println("you got an A!");
        } else if (percent < 90 && percent >= 80) {
            System.out.println("you got an B!");
        } else if (percent < 80 && percent >= 70) {
            System.out.println("you got an C!");
        } else if (percent < 80 && percent >= 70) {
            System.out.println("you got an D!");
        } else if (percent < 60 && percent >= 0) {
            System.out.println("you got an F!");
        }
    }
}
