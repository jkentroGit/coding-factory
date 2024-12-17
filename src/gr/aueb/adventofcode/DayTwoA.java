package gr.aueb.adventofcode;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class DayTwoA {
    public static void main(String[] args) {
        File f = new File("C:/Users/jkent/OneDrive/CF7-all-projects/IdeaProjects/Testbed/TextDay2.txt");
        String line;
        String[] tokens;
        int counter = 0;
        boolean report = false;
        int error = 0;

        try  {
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s");
                for (int i = 0; i < tokens.length-1; i++) {
                    if ((Integer.parseInt(tokens[i]) < Integer.parseInt(tokens[i + 1])) && ((Integer.parseInt(tokens[i + 1]) - Integer.parseInt(tokens[i])) <= 3)) {
                        report = true;
                    } else {
                        error++;
                        report = true;
                        i++;

                     if (error>1) {
                        report = false;
                        error = 0;
                        break;}
                    }


                    }
                    System.out.println(line);
                    System.out.println(report);
                    if (report) counter++;

//                    for (int i = 0; i < tokens.length - 1; i++) {
//                        if ((Integer.parseInt(tokens[i]) > Integer.parseInt(tokens[i + 1])) && (Integer.parseInt(tokens[i]) - Integer.parseInt(tokens[i + 1]) <= 3)) {
//                            report = true;
//                        } else {
//                            report = false;
//                            break;
//                        }
//
//                    }
//                    System.out.println(line);
//                    System.out.println(report);
//                    if (report) counter++;

                }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
