package lec05_Loops;

import java.util.Scanner;

public class sentinel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double n;
        double count = 0;

        do {
            System.out.println("enter number 1-4;0 để end");
            n = scanner.nextDouble();
            sum += n;
            count++;

        } while (n != 0);
        if (sum == 0) {
            System.out.println("no data");
        } else {
            System.out.println("sum=" + sum);
            System.out.println("qualivit=" + count);
            System.out.println("avg=" + sum / count);
        }
    }
}
