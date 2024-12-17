package gr.aueb.cf.ch6;

public class QuizF {
    public static void main(String[] args) {
    int arr[] = {3, 6, 1, 6, 4, 8, -79, 2};
        System.out.println(returMapping(arr));

    }

    public static boolean returMapping(int arr[]) {

        boolean istrue = true;

        for (int i=0; i < arr.length; i++) {

            if (arr[i] < 0) {
                istrue = false;
                break;
            }
        }
        return istrue;

    }
}
