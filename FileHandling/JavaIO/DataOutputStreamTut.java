package FileHandling.JavaIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataOutputStreamTut {
    public static void main(String[] args) {
        System.out.println("******** Reading Primitive Data Type *******************");
        try (DataInputStream din = new DataInputStream(new FileInputStream("primitives.data"))) {
            System.out.println(din.readInt());
            System.out.println(din.readChar());
            System.out.println(din.readDouble());
            System.out.println(din.readLong());
        } catch (IOException ioe) {
            System.err.println("Could not read from the file");
            ioe.printStackTrace();
        }
    }
}
