package FileHandling.JavaNIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelReadWithUTF8 {
    public static void main(String[] args) {
        Path filePath = Path.of("output.txt");

        if(!Files.exists(filePath)) {
            System.err.println("File Doesn't exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(filePath.toFile());
        FileChannel fileChannel = fis.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            Charset charset = StandardCharsets.UTF_8;

            while(fileChannel.read(buffer) > 0) {
                buffer.flip();
                CharBuffer charBuffer = charset.decode(buffer);

                while(charBuffer.hasRemaining()) {
                    char b = charBuffer.get();
                    System.out.print(b);
                }
            }
            buffer.clear();
        } catch (IOException e) {

            System.err.println("Cannot Read File");
        }
    }
}
