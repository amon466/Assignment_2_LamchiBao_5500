package lec05_Loops;

import java.util.*;
import java.util.Scanner;

public class randomnumber {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20) + 1;
        System.out.println(n);
        int min = 10;
        int max = 20;
        int ranger = (max - min + 1);
        System.out.println("print ranger=" + ranger);
        int random2 = random.nextInt(30 - 23 + 1) + 23;
        int random1 = random.nextInt(47) + 1;
        int random3 = random.nextInt(47) + 1;
        System.out.println("random1=" + random1);
        System.out.println("random2=" + random2);
        System.out.println("random3=" + random3);
    }
}
