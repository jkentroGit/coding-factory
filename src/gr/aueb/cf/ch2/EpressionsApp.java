package gr.aueb.cf.ch2;

public class EpressionsApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = num1++;
        result2 = ++num1;

        System.out.printf("Η διαίρεση είναι: %d με υπόλοιπο %d" ,div, mod);


    }
}
