package gr.aueb.cf.ch5;

import java.util.Scanner;

public class ThreeNumbersPass {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int num = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.printf("Δώσε τον %d ο αριθμό (1-49):", i);
            num = num();
            if (num < 1 || num > 49) {
                System.out.println("Δώστε έναν valid αριθμό.");
                --i;
                continue;
            }
            arr[i - 1] = num;


        }
        System.out.println(threeArtioi(arr));
        System.out.println(threePeritoi(arr));
        System.out.println(threeCont(arr));
        System.out.println(threeSameLast(arr));
        System.out.println(threeSameDec(arr));
    }

    public static int num() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static boolean threeArtioi(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count < 4;
    }

    public static boolean threePeritoi(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 != 0) count++;
        }
        return count < 4;
    }

    public static boolean threeCont(int[] arr) {
        int countpos = 0;
        int countneg = 0;
        for (int i = 0; i < arr.length - 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (arr[i] == arr[i + j] - j) {
                    countpos++;
                }
            }
            for (int j = 1; j <= 4; j++) {
                if (arr[i] == arr[i + j] + j) {
                    countneg++;
                }
            }
        }
        return countpos < 4 && countneg < 4;
    }

    public static boolean threeSameLast(int arr[]) {

        boolean ans = true;
        int[] finarr = new int[10];
        for (int el : arr) {

            finarr[el%10]++;
        }
        for (int count : finarr) {
            if (count > 3) {
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static boolean threeSameDec(int arr[]) {
        boolean ans = true;
        int[] finarr = new int[10];
        for (int el : arr) {

            finarr[el/10]++;
        }
       for (int count : finarr) {
           if (count > 3) {
               ans = false;
               break;
           }
       }
       return ans;
    }
}