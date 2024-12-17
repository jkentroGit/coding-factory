package gr.aueb.cf.ch6;

public class QuizE {
    public static void main(String[] args) {
        int arr[] = {30, 61, 16, 63, 48, 82, 79, 25};

//        int newarr[] = returMapping(arr);
//        for (int i=0; i < arr.length; i++) System.out.print(newarr[i] + " ");
        System.out.println(threeCons(arr));



    }

    public static int[] returMapping(int arr[]) {

        for (int i=0; i < arr.length; i++)
          {arr[i] *= 2;
             };
        return arr;


    }

    public static boolean threeCons (int[] arr) {
        boolean isit = false;
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] % 10;
            for (int j = i+1; j < arr.length; j++) {
                int digittwo = arr[j] % 10;
                if (digit == digittwo) {
                    isit = true;
                    break;
                }

            }

        }

        return isit;

    }
}
