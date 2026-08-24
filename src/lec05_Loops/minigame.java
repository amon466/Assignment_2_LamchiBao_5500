package lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class minigame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomnuber = random.nextInt(21);
        int doan;
        int count=0;
        do {
            System.out.print("guess= ");
            doan = scanner.nextInt();
            if (doan == randomnuber) {
                System.out.println("print winner");
            }else if(doan<randomnuber){
                System.out.print("nuber>"+doan  );
            }else if(doan>randomnuber){
                System.out.print("number<"+doan);
            }
            count++;
        }while(doan!=randomnuber);
        System.out.print("tong so lan dem =" +count);
        
    }
}
