package gr.aueb.cf.ch7;
/**
 * Code a string with custom shift.
 * Excludes numbers and non-letter characters
 */

import java.util.Scanner;

public class CodeText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascii = 0;
        int shift = 0;
        char letter;
        String input;
        StringBuilder code = new StringBuilder();

        System.out.print("Please insert text: ");
        input = sc.nextLine();

        System.out.print("Please insert shift: ");
        shift =  sc.nextInt();

        for (int i =0; i < input.length(); i++) {
            ascii = input.charAt(i);
            if (ascii <65 || ascii > 122 || (ascii > 57 && ascii < 65)) {ascii = input.charAt(i);
            } else if ((ascii + shift) > 122) { ascii = (input.charAt(i) + shift) % 122 + 64;
            } else ascii = input.charAt(i) + shift;

            if (ascii >= 91 && ascii <=96) {
                letter = (char) (ascii + 6);
            } else letter = (char) ascii;

            code.append(letter);
        }

        System.out.println("Coded text is: " + code);
    }
}
