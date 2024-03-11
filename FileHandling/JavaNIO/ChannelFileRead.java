package FileHandling.JavaNIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChannelFileRead {
    public static void main(String[] args) {
        System.out.println("##### Exploring Channel through File Read/Write ###### ");

        Path filePath = Path.of("/home/osman/skills");

        if(!Files.exists(filePath)) {
            System.out.println("File not exists");
            return;
        }

        try (FileInputStream fis = new FileInputStream(filePath.toFile());
        FileChannel fileChannel = fis.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while(fileChannel.read(buffer) > 0) {
                buffer.flip();
                while(buffer.hasRemaining()) {
                    byte b = buffer.get();
                    System.out.print((char)b);
                }
            }
            buffer.clear();
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
}
