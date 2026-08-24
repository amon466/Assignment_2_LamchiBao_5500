
package Lec04_if;

import java.util.Scanner;

public class tayngu {
    public static float number(float a,float b,float c){
        if(a>b&&a>c){
            return a;
        }
            else if( b>a&&b>c){
                    return b;
                    }
            else 
                return c;
        
        }    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mon thu nhat");
        float a = scanner.nextFloat();
        System.out.println("nhap mon thu hai");
        float b=scanner.nextFloat();
        System.out.println("nhap mon thu ba ");
        float c = scanner.nextFloat();
        float max = number(a, b, c);
        System.out.println("So lon nhat la: " + max);
    }
        
}
