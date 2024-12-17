package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DisektoEtos {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        boolean isitdisekto;
        int year = 0;

        System.out.println("Give year: ");
        year = inn.nextInt();

        isitdisekto = ((year % 4==0) && (year % 100 != 0)) || (year % 400 ==0);
        System.out.println ("Year " + year + " is disekto: " + isitdisekto);

    }
}
