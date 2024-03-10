package FileHandling.JavaNIO;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class ReadWriteBuffer {
    public static void main(String[] args) {
        CharBuffer ch = CharBuffer.allocate(10);
        System.out.println("Buffer After Creation:");
        printBuffer(ch);

        for(int i = 65; i < 65+ch.capacity(); i++) {
            ch.put((char)i);
        }
        System.out.println("Buffer After putting data:");
        printBuffer(ch);
    }
    public static void printBuffer(CharBuffer ch) {
        System.out.println("Position: " + ch.position() + " Limit: " + ch.limit());
        int lim = ch.limit();
        System.out.print("Data: ");
        for(int i = 0; i < lim; i++) {
            System.out.print(ch.get(i) + " ");
        }
        System.out.println();
    }
}
