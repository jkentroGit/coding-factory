package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsPrint {
    public static void main(String[] args) {
        int n = 0;
        int choice = 0;

        while (choice !=6) {
            printMenu();
            choice = giveChoice();
            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή. Προσπαθήστε ξανά.");
                continue;
            }
            if (choice == 6) {
                System.out.println("Ευχαριστούμε για τη χρήση!");
                continue;
            }

            printMenu2();
            n = giveChoice();
            switch (choice) {
                case 1:
                    choiceOne(n);
                    break;
                case 2:
                    choiceTwo(n);
                    break;
                case 3:
                    choiceThree(n);
                    break;
                case 4:
                    choiceFour(n);
                    break;
                case 5:
                    choiceFive(n);
                    break;
                default:
                    break;

            }


        }
    }
    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα" + "\n");
        System.out.println("Δώσε επιλογή:");
    }

    public static void printMenu2() {
        System.out.println("Δώστε τον αριθμό n:");
    }

    public static int giveChoice() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();

    }

    public static void choiceOne(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void choiceTwo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void choiceThree(int n) {
        for (int i=1; i<=n; i++) {
            choiceOne(n);
        }
    }

    public static void choiceFour(int n) {
        for (int i=1; i<=n; i++) {
            choiceOne(i);
        }
    }

    public static void choiceFive(int n) {
        for (int i=n; i>0; i--) {
            choiceOne(i);
        }
    }
    public static boolean isChoiceValid (int a) {
        return a <= 6 && a >= 1;
    }
}