package gr.aueb.cf.ch4;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        char star = '*' ;

        System.out.println("Please give a number:");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.printf("%c", star);
        }
        System.out.println("\n" + "----------------------------");

        for (int i = 1; i <= num; i++) {
            System.out.printf("%c" + "\n", star);
        }
        System.out.println("\n" + "----------------------------");

        for (int i = 1; i <= num; i++) {
            for (int j=1; j <=i; j++) {
                System.out.printf("%c", star);
            }
            System.out.println();
        }
        System.out.println("\n" + "----------------------------");

        for (int i = 1; i <= num; i++) {
            for (int j=num; j >=i; j--) {
                System.out.printf("%c", star);
            }
            System.out.println();
        }
        System.out.println("\n" + "----------------------------");

    }
}
