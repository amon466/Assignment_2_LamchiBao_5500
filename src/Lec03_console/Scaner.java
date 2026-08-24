package Lec03_console;

import java.util.Scanner;

public class Scaner {

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);//duyet viet so de lenh duoi cha
        System.out.print("enter an interger number:");
        int number = scanner.nextInt();
        System.out.println("number=" + number);
    }
}
