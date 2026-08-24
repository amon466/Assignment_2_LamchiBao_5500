package Lec04_if;

import java.util.Scanner;

public class swichcase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tu 1-5");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            default:
                System.out.println("So khong hop le");
        }
    }
}
