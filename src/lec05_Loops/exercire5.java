
package lec05_Loops; 
import java.util.Scanner;

public class exercire5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase;
        do{
            System.out.print("type password");
            phrase =console.next();
            
        }while(!phrase.equals("duy tan"));
        System.out.println("Password accepted!");
    }
    
}
