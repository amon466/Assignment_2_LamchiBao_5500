package Lec03_console;

import java.util.Scanner;

public class studenin4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter full name");
        String name = scanner.nextLine();
        System.out.println("enter gpa");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("enter chuyen");
        String spec = scanner.nextLine();
        System.out.println("enter que quan ");
        String myhome = scanner.nextLine();

        System.out.println("full name= " + name);
        System.out.println("gpa=" + gpa);
        System.out.println("chuyen nganh=" + spec);
        System.out.println("myhome=" + myhome);

    }
}
