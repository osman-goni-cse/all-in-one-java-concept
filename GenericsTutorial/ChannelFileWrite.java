package GenericsTutorial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChannelFileWrite {
    public static void main(String[] args) {
        System.out.println(" ********* File Write Through File Channel **************");

        Path filePath = Path.of("/home/osman/shortBio");

        if(!Files.exists(filePath)) {
            System.out.println("File Didn't exist");
            return;
        }
        String data = "Product Designer @Grab";

        try (FileOutputStream fos = new FileOutputStream(filePath.toFile());
        FileChannel fileChannel = fos.getChannel()) {
            byte[] dataBytes = data.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(dataBytes);
            fileChannel.write(buffer);

        } catch (IOException e) {
            System.out.println("Cannot write to the file");
            // TODO: handle exception
        }
    }
}
