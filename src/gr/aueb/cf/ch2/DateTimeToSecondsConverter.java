package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {

        int days, hours, minutes, seconds, totalSecond;
        Scanner input = new Scanner(System.in);

        System.out.println("Give days:");
        days = input.nextInt();
        System.out.println("Give hours:");
        hours = input.nextInt();
        System.out.println("Give minutes:");
        minutes = input.nextInt();
        System.out.println("Give seconds:");
        seconds = input.nextInt();

        days = days *86400;
        hours = hours * 3600;
        minutes = minutes * 60;
        totalSecond = days + hours + minutes + seconds;

        System.out.printf("Total seconds are %,d",totalSecond);


    }
}
