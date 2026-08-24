
package lec05_Loops;

import java.util.Scanner;

public class exercire6 {
    public static void main(String[] args) {       
        Scanner console = new Scanner(System.in);
int sum = 0;
int number;
do{
System.out.print("Enter a number (-1 to quit): ");
 number = console.nextInt();
 sum = sum + number;
} while (number != -1);
System.out.println("The total is " + sum);
}
}
