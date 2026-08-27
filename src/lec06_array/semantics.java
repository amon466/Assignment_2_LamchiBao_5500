package lec06_array;

import java.util.Arrays;

public class semantics {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = array1;
        array1[0] = 2;
        System.out.println(Arrays.toString(array2));
    }
}
