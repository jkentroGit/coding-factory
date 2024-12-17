package gr.aueb.cf.ch6;

public class ArrayMinAndMax {
    public static void main(String[] args) {

        int arr[] = {8,2,3,5,4,1};
        int low=0;
        int high=0;
        int res = 0;

        res = getMinPosition(arr,1,5);
        System.out.printf("Η χαμηλότερη τιμη είναι στη θέση: %d με την τιμή: %d.",res+1, arr[res]);



    }
    /**
     * Find Min and Max Value in range.
     */
    public static int getMinPosition (int arr[], int low, int high) {
        if (arr==null || arr.length <1) return -1;

        int minval = arr[low];
        int minpos = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
                minpos = i;
            }
        }
            return minpos;

    }
}
