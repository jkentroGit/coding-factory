package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        double c = 0.0;
        c = inputCelsius();

        System.out.printf("The temperature in F is: %.2f", celsiusToFahrenheit(c));

    }

    public static double celsiusToFahrenheit(double a) {
        return a * 9/5 + 32;
    }

    public static double inputCelsius() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please give temperature in celsius: ");
        return in.nextDouble();
    }
}

