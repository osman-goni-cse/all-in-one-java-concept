package FileHandling.JavaIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTut {
    public static void main(String[] args) {
        System.out.println(" ********* Character Stream Tutorial ***************");

        try (Reader in = new FileReader("/home/osman/skills")) {
            int c;
            while((c = in.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Could not read file");
            e.printStackTrace();
        }
    }
}
