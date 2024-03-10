package FileHandling.JavaIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamTut {
    public static void main(String[] args) {
        System.out.println(" ******** Working With Primitive Data Type **************");
        String filename = "primitives.data";

        try (DataOutputStream dos = new DataOutputStream(
            new FileOutputStream(filename))) {
            dos.writeInt(152);
            dos.writeChar('c');
            dos.writeDouble(3.141596358);
            dos.writeLong(Long.MAX_VALUE);
            dos.flush();
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Error writing in the file");
            e.printStackTrace();
        }
    }
}
