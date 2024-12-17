package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Protoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int zero = 1;
        System.out.println("Give a number: ");
        num = in.nextInt();

        for (int i=2; i<=9; i++) {
            if (num / i == 0) {


            }
            else {
                System.out.println("The number is NOT primal");
            }
        }
    }
}
