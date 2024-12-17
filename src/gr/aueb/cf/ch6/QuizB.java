package gr.aueb.cf.ch6;

import java.util.Scanner;

public class QuizB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {3,6,1,33,4,8,79,2};
        int result = 0;

        System.out.println("Please give first and last array position to search:");
        int low = in.nextInt();
        int high = in.nextInt();

        result = getSecondToMaxPosition(arr,low,high);

        System.out.println("Second Max Value of Array is:" + result);



    }

    public static int getSecondToMaxPosition(int arr[], int low, int high) {

        int minvalue = arr[low];
        int secondtomin = Integer.MAX_VALUE;

        for (int i = low; i < high; i++) {
            if (arr[i] < minvalue) {
                minvalue = arr[i];
            }
        }
        for (int i = low-1; i < high; i++) {
            if (arr[i] > minvalue && arr[i] < secondtomin) {
                secondtomin = arr[i];
            }
        }
        return secondtomin;
    }
}
