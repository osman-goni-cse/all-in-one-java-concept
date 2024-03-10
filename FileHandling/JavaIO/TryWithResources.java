package FileHandling.JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args) {
        System.out.println(" *************** Try With Resources Statement *****************");

        try(InputStream in = new FileInputStream("/home/osman/skills")) {
            int c;
            while( (c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ioe) {
            System.err.println("Could not work with that file");
        }
    }
}
