package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        int euro;
        int dollars;
        int cents;
        int convRate;
        Scanner input = new Scanner(System.in);

        System.out.println("Εισάγετε Ευρώ:");
        euro = input.nextInt();
        System.out.println("Εισάγετε πόσα Cents είναι το Ευρώ:");
        convRate = input.nextInt();
        dollars = (convRate * euro) /100;
        cents = (convRate * euro) % 100;

        System.out.printf("Τα %d ευρώ αντιστοιχούν σε %d δολάρια και %d cents" ,euro,dollars,cents);
    }
}
