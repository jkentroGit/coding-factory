package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Fahreneit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ftemp = 0;
        int ctemp = 0;

        System.out.println("Εισάγετε βαθμούς F: ");
        ftemp = in.nextInt();
        ctemp = 5 * (ftemp-32) / 9;

        System.out.printf ("Οι %d Φαρενάιτ αντιστοιχούν σε %d βαθμούς κελσίου!" ,ftemp, ctemp);
    }
}
