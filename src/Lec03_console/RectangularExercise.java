//dien tich hinh chu nhat
package Lec03_console;

import java.util.Scanner;

public class RectangularExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh ");
        float lenght= scanner.nextFloat();
        
        System.out.println("nhap canh");
        float width= scanner.nextFloat();
        
        System.out.println("dien tich= "+lenght*width);
    }    
    
}
