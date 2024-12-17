package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 0;
        double random = (Math.random() * 100) +1;
        int randomint = (int) random;
        System.out.println(randomint);

        do {
            System.out.println("Please guess a number between 1-100:");
            guess = in.nextInt();
            if (guess > randomint) {
                System.out.println("The number you gave is bigger...");
            }
            if (guess < random) {
                System.out.println("The number you gave is smaller...");
            }

        }
        while (guess!= randomint);

        System.out.println("You nailed it!");
    }
}
