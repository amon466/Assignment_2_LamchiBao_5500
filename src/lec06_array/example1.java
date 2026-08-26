package lec06_array;

import java.util.ArrayList;

public class example1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();//khởi tạo mảng array mới 
        for (int i = 0; i < 8; i++) {
            numbers.add(i); // Thêm phần tử vào danh sách
            System.out.print(numbers.get(i) + " "); // Lấy phần tử theo index
        }
        System.out.println();
    }
}
