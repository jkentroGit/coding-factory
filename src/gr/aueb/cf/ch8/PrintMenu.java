package gr.aueb.cf.ch8;

import java.util.Scanner;

public class PrintMenu {
    public static void main(String[] args) {

        printMenu();

        System.out.println("You chose: " + getChoice());

    }

    public static void printMenu() {
        System.out.println("1. Choice");
        System.out.println("2. Choice");
        System.out.println("3. Choice");
        System.out.println("4. Choice");
        System.out.println("5. Exit");
    }

    public static int getChoice() {
        int num = 0;
        try  (Scanner in = new Scanner(System.in)) {
                num = in.nextInt();
                return num;
            }
        catch (Exception e) {
            System.out.println("NOT A VALID NUMBER!");
            e.printStackTrace();
            return -1;
        }
    }
}
