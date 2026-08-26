package lec06_array;

import java.util.ArrayList;

public class example2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            numbers.add(i * 2); // Thêm trực tiếp giá trị đã nhân 2
            System.out.print(numbers.get(i) + " ");
        }
    }

}
