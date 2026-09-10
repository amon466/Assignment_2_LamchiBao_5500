package lec08_objeectandclass.Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        Rectangle rect = new Rectangle(length, width);

        System.out.println("Length: Width: Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        scanner.close();
    }
}
