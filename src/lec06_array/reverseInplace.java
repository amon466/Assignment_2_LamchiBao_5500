package lec06_array;

import java.util.Arrays;

public class reverseInplace {

    private static void reverseInplace(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int opperiteIndex = numbers[i];
            int temp = numbers[i];
            numbers[opperiteIndex] = temp;

        }

    }

    public static void main(String[] args) {

        int[] numbers = {1, 6, 2, 8, 3};

        System.out.println("Before: " + Arrays.toString(numbers));

        reverseInplace(numbers);  
        System.out.println("After: " + Arrays.toString(numbers));
    }
}
