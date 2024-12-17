package gr.aueb.cf.ch4;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();


        sum = adds(a,b,c);
        System.out.println(sum);

    }

    public static int adds(int a,int b,int c) {
        if (a>b) {
        return a + b + c;}
        else return a + b +c +100;


    }
}
