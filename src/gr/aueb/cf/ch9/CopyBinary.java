package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.UUID;

public class CopyBinary {
    public static void main(String[] args) {
        String fname;
        byte[] buf = new byte[4096];

        Scanner in = new Scanner(System.in);
        System.out.print("Give file name: ");
        fname = in.nextLine();

        File toCopy = new File("C:/tmp/" + fname);
        File isCopied = new File("C:/tmp/" + UUID.randomUUID().toString().replace(":", "_") + fname);

        try (BufferedInputStream breader  = new BufferedInputStream(new FileInputStream(toCopy));
        BufferedOutputStream bwriter = new BufferedOutputStream(new FileOutputStream(isCopied))) {
            int line;
            while ((line = breader.read(buf)) != -1) {
                  bwriter.write(buf, 0, line);
            }

        } catch (IOException e){
           e.printStackTrace();
        }

        String[] printName;
        printName = fname.split("\\.");
        System.out.println(printName[1]);
        System.out.println("Absolute Path: " + isCopied.getAbsolutePath());





    }
}
