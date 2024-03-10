package FileHandling.JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTut {
    public static void main(String[] args) {
        System.out.println(" ########### Output Stream Tutorial ################");

        OutputStream fos = null;

        try {
            String text = "Team Lead @AI";
            byte[] textBytes = text.getBytes();

            fos = new FileOutputStream("/home/osman/shortBio");

            fos.write(textBytes);
            fos.flush();
        } catch (IOException ioe) {
            System.err.println("Could not write to the file");
            ioe.printStackTrace();
        } finally {
            if( fos != null) {
                try {
                    fos.close();
                }catch(IOException ioe) {
                    System.err.println("Could not close file");
                    ioe.printStackTrace();
                }
            }
        }

    }
}
