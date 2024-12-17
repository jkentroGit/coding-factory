package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DatePrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int date = 0;
        int month = 0;
        int year = 0;
        int twodigityear = 0;

        System.out.println("Δώστε ημέρα, μήνα, έτος:");
        date = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        twodigityear = year % 1000;


        System.out.printf ("Η ημερομηνία είναι %02d/%02d/%d" ,date ,month, twodigityear);

    }
}