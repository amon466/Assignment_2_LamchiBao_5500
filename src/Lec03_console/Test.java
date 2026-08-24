package Lec03_console;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullname = scanner.nextLine();

        System.out.println("Enter student id:");
        int studentId = scanner.nextInt();
        System.out.println("fullname="+ fullname);
        System.out.println("studen id="+ studentId);
        
    }

}

