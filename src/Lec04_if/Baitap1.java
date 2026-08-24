package Lec04_if;

import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int number = scanner.nextInt();
        if (number > 1) {
            System.out.println("so nguyen k am");
        }
        if (number < -1) {
            System.out.println("so nguyen am ");
        } else {
            System.out.println("so nguyen 0");
        }
    }

}
