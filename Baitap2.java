
package Lec04_if;

import java.util.Scanner;


public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        if ( n % 2 == 0 ) {
            System.out.println("so chan");
        }
        else
            System.out.println("so le");
        
    }
}
