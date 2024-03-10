package FileHandling.JavaNIO;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class BufferInfo {
    public static void main(String[] args) {
        System.out.println("*** Exploring Buffer *****");

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        System.out.println("Capacity: " + byteBuffer.capacity());
        System.out.println("Position: " + byteBuffer.position());
        System.out.println("Limit: " + byteBuffer.limit());

        try {
            byteBuffer.reset();
            System.out.println("Mark: " + byteBuffer.position());
        } catch (InvalidMarkException ime) {
            // TODO: handle exception
            System.err.println("Mark is not set");
        }
    }
}
