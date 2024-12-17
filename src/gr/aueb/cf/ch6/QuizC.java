package gr.aueb.cf.ch6;

import java.util.Scanner;

public class QuizC {
    public static void main(String[] args) {

        int arr[] = {3, 6, 1, 6, 4, 8, 79, 2};
        int point = returnPos(arr);

        if (point == -1) {
            System.out.println("The number doesn't exist!");
        }
        else System.out.print("The number you gave is at position: " + (point+1));

        }


    public static int returnPos(int arr[]) {
        Scanner in = new Scanner(System.in);
        int choise = 0;
        int pos = -1;

        System.out.println("Δώστε έναν αριθμό: ");
        choise = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == choise) {
                return i;
            }
        }
        return -1;

    }
}