
package lec05_Loops;

import java.util.Scanner;

public class numberwithfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n= scanner.nextInt();
        for (int i=1;i<=5;i++){
            System.out.println("entern="+i);
        }
    }
}
