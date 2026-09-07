package lec07_String;

import java.util.Scanner;

public class studenID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter studen id :");
        String id = scanner.nextLine();
        System.out.println("for exanple"+id.substring(8)+"major: "+id.substring(0, 2));
        System.out.println("numeric part="+id.substring(2));
    }

}
