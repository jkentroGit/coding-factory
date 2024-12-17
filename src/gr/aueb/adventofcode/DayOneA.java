package gr.aueb.adventofcode;

import javax.crypto.spec.PSource;
import java.io.File;
import java.util.Scanner;

public class DayOneA {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
        File f = new File("C:/Users/jkent/OneDrive/CF7-all-projects/IdeaProjects/Testbed/Text.txt");
        String line;
        String[] tokens;
        int count = 0;
        int newcount = 0;
        int total = 0;
        int dif = 0;

        try (Scanner in = new Scanner(f)) {
            while (in.hasNextLine() && in.nextLine()!= null) {
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] arra = new int[count];
        int[] arrb = new int[count];

        try (Scanner inb = new Scanner(f)) {


            for (int i = 0; i < count; i++) {
                line = inb.nextLine();
                tokens = line.split("\\s+");
                for (String token : tokens) {
                    arra[newcount] = Integer.parseInt(tokens[0]);
                    arrb[newcount] = Integer.parseInt(tokens[1]);
                }
                newcount++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] sorteda = selectionSort(arra);
        int[] sortedb = selectionSort(arrb);

        for (int i=0; i < sorteda.length; i++) {
            if (sorteda[i] >= sortedb[i]) dif = sorteda[i] - sortedb[i];
            else dif = sortedb[i] - sorteda[i];

            total = total + dif;
        }

        System.out.println(total);

//        ..........................
        int counter = 0;
        int added = 0;
        for (int i = 0; i < sorteda.length; i++) {
            counter = 0;
            for (int j =0; j < sortedb.length; j++) {
                if (sorteda[i] == sortedb[j]) {
                    counter++;
                }
            }
            added = added + (sorteda[i] * counter);
        }

        System.out.println(added);


    }

        public static int[] selectionSort ( int[] arr){

            for (int i = 0; i < arr.length - 1; i++) {

                // Find min
                int minPosition = i;
                int minValue = arr[minPosition];

                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < minValue) {
                        minValue = arr[j];
                        minPosition = j;
                    }
                }

                // Swap(minPos, i)
                swap(arr, minPosition, i);
            }
            return arr;
        }

        public static void swap ( int[] arr, int i, int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
}