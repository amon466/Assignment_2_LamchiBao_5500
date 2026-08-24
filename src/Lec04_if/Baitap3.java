package Lec04_if;

import java.util.Scanner;

public class Baitap3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap diem tong ket:");
        double diem = scanner.nextDouble();

        if (diem >= 5.0) {
            System.out.println("Dat");
        } else {
            System.out.println("Khong dat");
        }
    }
}
