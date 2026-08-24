
package Lec03_console;

import java.util.Scanner;
public class FtoC {
    public static double converter (double cell){
        return (cell *9)/5+32;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter celsius");
        double cel = scanner.nextDouble();
        
        System.out.println("cel="+cel);
        System.out.println("");
       
        
                
    }
    
}
