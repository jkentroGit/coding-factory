package gr.aueb.cf.ch5;

import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Give a number: ");
        num = in.nextInt();
        System.out.printf("The square of %d is %d.", num, square(num));

    }
    public static int square (int a) {
        return a * a;
    }
}
