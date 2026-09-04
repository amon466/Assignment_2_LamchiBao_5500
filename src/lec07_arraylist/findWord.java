package lec07_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class findWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Word = new ArrayList<>();
//        Word.add("apple");
//        Word.add("banana");
//        Word.add("cherry");
//        Word.add("date");
        System.out.print("enter wrold");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("enter Word number " + (i + 1) + ": ");
            String x = scanner.nextLine();
            Word.add(x);
        }
        System.out.println("Word" + Word);
        System.out.println("fintoWord");
        String targetWord = scanner.nextLine();
        System.out.println("Contains: " + Word.contains(targetWord));
        System.out.println("Index: " + Word.indexOf(targetWord));
    }

}
