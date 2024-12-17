package gr.aueb.cf.ch2;

public class PrintApp {
    public static void main(String[] args) {
        int day = 6;
        int month = 4;
        int year = 2023;

        System.out.printf("The date is: %04d/%04d/%,d\n" ,day, month, year);
    }
}
