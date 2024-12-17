package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        while (choise != 5) {

            System.out.println("1. Εισαγωγή" + "\n" + "2. Διαγραφή" + "\n" + "3. Ενημέρωση" + "\n" + "4. Αναζήτηση" + "\n" + "5. Έξοδος");
            System.out.println("Please choose an option: ");
            choise = in.nextInt();
            while (choise > 5) {
                System.out.println("Please choose again!");
                choise = in.nextInt();
            }
            if (choise == 1) {
                System.out.println("Επιλέξατε εισαγωγή.");
            }
            if (choise == 2) {
                System.out.println("Επιλέξατε διαγραφη.");
            }
            if (choise == 3) {
                System.out.println("Επιλέξατε ενημερωση.");
            }
            if (choise == 4) {
                System.out.println("Επιλέξατε αναζήτηση.");
            }
        }
    }
}
