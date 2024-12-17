package gr.aueb.cf.ch5;

import java.util.Scanner;

public class LowAndHighIndexOf {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int num = 0;
        int posbegin = 0;
        int posend = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please give a number:");
        num = in.nextInt();

        for (int i=0; i< arr.length; i++) {
            if (arr[i]==num) {
                posbegin = i;
                break;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==num) {
                posend = j;
            }
        }

        System.out.printf("The number appear first at position %d and last at position %d.", posbegin, posend);
    }
}
