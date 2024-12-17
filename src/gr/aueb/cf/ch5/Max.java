package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        System.out.printf("Bigger number is %d", maxNum());
     }

    public static int maxNum() {
        int a = 0;
        int b = 0;
        int d = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Give 3 numbers:");
        a= in.nextInt();
        b= in.nextInt();
        d= in.nextInt();


        return Math.max(a,Math.max(b,d));
    }
}
