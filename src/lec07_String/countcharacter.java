package lec07_String;

import java.util.Scanner;

public class countcharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string: ");
        String text = scanner.nextLine();
        System.out.println("enter character to count: ");
        char target = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("cccurrences of "+target+""+count);
    }
}
