package FileHandling.JavaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTut {
    public static void main(String[] args) {
        System.out.println("********** Character Stream Writer Tutorial ***************");

        try (Writer out = new FileWriter("/home/osman/shortBi", true)) {
            String text = "আমার সোনার বাংলা";
            out.write(text);
            out.flush();
            
        } catch (IOException e) {
            System.err.println("Could not write to the file:");
            e.printStackTrace();
        }
    }
}
