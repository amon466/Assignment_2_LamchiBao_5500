package lec07_arraylist;

import java.util.Arrays;

public class reversearray {

    private static void reverseInplace(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int opperiteIndex = numbers[i];
            int temp = numbers[i];
            numbers[opperiteIndex] = temp;

        }
    }

    public static void main(String[] args) {

        int[] numbers = {11, 42, -5, 27, 0, 89};

        System.out.println("Before: " + Arrays.toString(numbers));

        reverseInplace(numbers);
        System.out.println("After: " + Arrays.toString(numbers));
    }
}
