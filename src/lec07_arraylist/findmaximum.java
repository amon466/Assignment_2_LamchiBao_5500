package lec07_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class findmaximum {

    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        System.out.println("Scores: " + numbers);
        if (!numbers.isEmpty()) {
            int max = findMax(numbers);
            System.out.println("Maximum: " + max);
        }
        else System.out.println("invalid size of ");
    }
}
