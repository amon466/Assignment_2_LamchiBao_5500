    
package Lec03_console;

import java.util.Scanner;

public class bamon {
    public static double avergare (float a, float b,float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mon toan");
        float math = scanner.nextFloat();
        System.out.println("nhap mon lap trinh");
        float code = scanner.nextFloat();
        System.out.println("nhap tieng anh  ");
        float eng = scanner.nextFloat();
        
        System.out.println("toan="+ math);
        System.out.println("code="+ code);
        System.out.println("eng="+eng);
                
    }
    
}
