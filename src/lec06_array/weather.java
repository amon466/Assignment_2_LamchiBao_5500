package lec06_array;

import java.util.Arrays;
import java.util.Scanner;

public class weather {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("'how many days'temperatues?");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("day" + (i + 1) + "high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];

        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.printf("average temp=%.1f", average);
        System.out.println("");
        System.out.println(count + "days above average");
        System.out.println("temperatus: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("two coldest days:" + temps[0] + "," + temps[1]);
        System.out.println("two hotdest days" + temps[temps.length - 1] + "," + temps[temps.length - 2]);
    }

}
