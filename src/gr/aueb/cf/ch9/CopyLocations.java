package gr.aueb.cf.ch9;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CopyLocations {
    public static void main(String[] args) {

        File fin = new File("C:/tmp/locations.txt");
        File fout = new File("C:/tmp/locationsnew.txt");
        String [] tokens;
        String line;

        try (Scanner in = new Scanner(fin); PrintWriter pw = new PrintWriter(fout, StandardCharsets.UTF_8)) {
            while (in.hasNextLine() && ((line = in.nextLine()) != null)) {
                tokens = line.split(",");
                pw.printf("{ location: '%s', latitude: %s, longtitude: %s } \n", tokens[0], tokens[1], tokens[2]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
