package lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class minigame2 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int wrongAttempts = 0;
        System.out.println("The game ends after three incorrect answers. ");

        do {
            int numOperands = random.nextInt(4) + 2;
            int correctAnswer = 0;
            String question = "";
            for (int i=1 ; i <= numOperands; i++) {
                int randomnumber = random.nextInt(10) + 1;
                correctAnswer += randomnumber;
                if (i == numOperands) {
                    question += randomnumber;

                } else {
                    question += randomnumber + "+";
                }
            }
            System.out.print("question: " + question + "=");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                score++;
                System.out.println("Exactly!!!(point:" + score + "");

            } else {
                wrongAttempts++;
                System.out.println("Wrong" + correctAnswer);
                System.out.println("Wrong attempts" + wrongAttempts + "/3 lần");
            }
        } while (wrongAttempts < 3);
        System.out.println("tong score" + score);
    }

}
