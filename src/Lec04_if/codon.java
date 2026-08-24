package Lec04_if;

import java.util.Scanner;

public class codon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("what x did you earn");
        float x = scanner.nextFloat();
        System.out.print("what y did you earn");
        float y = scanner.nextFloat();
        if (x == 1 && y == 1) {
            System.out.println("fox thu nhat");
        }
        if (x == 2 && y == 5) {
            System.out.println("goc thu 2");
        }
        if (x == -2 && y == -3) {
            System.out.println("goc thu 3");
        }
        if (x == 2 && y == -1) {
            System.out.println("goc thu 4");
        }
 
    }

}
