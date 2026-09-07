
package lec07_String;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter line: ");
        String line=scanner.nextLine();
        System.out.print("enter word: ");
        String word=scanner.nextLine();
        String stars="*".repeat(word.length());
        line=line.replace(word, stars);
        System.out.println("censored: "+line);
                
    }
          
}
