package FileHandling.JavaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelWriteWithUTF8 {
    public static void main(String[] args) {
        System.out.println("******** Write to file using UTF-8 encoding scheme *************");

        Path poemFilePath = Path.of("output.txt");

        if(!Files.exists(poemFilePath)) {
            System.err.println(poemFilePath + " File Doesn't exist");
            try {
                Files.createFile(poemFilePath);
                System.out.println("Created File " + poemFilePath.getFileName());
            } catch (IOException e) {
                System.err.println("Cannot created file");
                e.printStackTrace();
            }
        }

        String data = "চল! চল! চল! ওই বাতাসের ধারায় একা চল। চলে যাই চলে যাই, বসন্তের আসের পথে,";
        

        try (FileOutputStream fos = new FileOutputStream(poemFilePath.toFile());
        FileChannel fileChannel = fos.getChannel()) {
            
            Charset charset = StandardCharsets.UTF_8;
            
            CharBuffer charBuffer = CharBuffer.wrap(data);
            ByteBuffer encodedData = charset.encode(charBuffer);
            fileChannel.write(encodedData);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
