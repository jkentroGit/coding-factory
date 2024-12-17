package gr.aueb.cf.ch6;

public class QuizD {
    public static void main(String[] args) {
        int arr[] = {3, 6, 1, 6, 4, 8, 79, 2};

        ReturEven(arr);


    }

    public static void ReturEven(int arr[]) {

        for (int i=0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
