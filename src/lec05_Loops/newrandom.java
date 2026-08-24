package lec05_Loops;

import java.util.*;

public class newrandom {

    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(3);
       // double randomGpa = random.nextDouble() * 2.5 + 1.5;
        if (r == 0) {
            System.out.println("Rock");
        } else if (r == 1) {
            System.out.println("Paper");
        } else { // r == 2
            System.out.println("Scissors");
        }

    }
}
