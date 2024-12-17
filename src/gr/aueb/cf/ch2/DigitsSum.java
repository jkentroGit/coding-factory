package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {

        int doubleDigit;
        int firstNum;
        int lastNum;
        int sum;

        Scanner input = new Scanner(System.in);

        System.out.println("Give a double digit number:");
        doubleDigit = input.nextInt();
        firstNum = doubleDigit /10;
        lastNum = doubleDigit % 10;
        sum = firstNum + lastNum;
        System.out.printf("The sum of two digits is %d" ,sum);

    }
}
