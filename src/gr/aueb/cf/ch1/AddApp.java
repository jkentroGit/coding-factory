package gr.aueb.cf.ch1;

import java.util.Scanner;

public class AddApp {
    public static void main(String[] args) {
        int num1, num2, sum;
        int test;

        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με " + sum);
        System.out.println((int) Math.pow(num1, num2));

    }
}