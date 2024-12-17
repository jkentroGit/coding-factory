package gr.aueb.cf.ch6;

import java.util.Scanner;

public class QuizA {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[] = {3,6,1,33,4,8,79,2};
        int result = 0;

        System.out.println("Please give first and last array position to search:");
        int low = in.nextInt();
        int high = in.nextInt();

        result = getMaxPosition(arr,low,high);

        System.out.println("Max Value of Array is:" + result);



    }

    public static int getMaxPosition (int arr[], int low, int high) {

        int maxvalue = 0;
        for (int i = low-1; i < high; i++)
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        return maxvalue;
    }
}
