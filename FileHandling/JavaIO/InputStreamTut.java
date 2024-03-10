package FileHandling.JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTut {
    public static void main(String[] args) {
        System.out.println(" Low Level I/O Concepts");

        InputStream in = null;

        try {
            in = new FileInputStream("/home/osman/shortBio");
            int c;
            while((c = in.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException ioe) {
            System.out.println("Could not read file");
            ioe.printStackTrace();
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Unable to close FileInputStream");
                    e.printStackTrace();
                }
            }
        }
    }
}
