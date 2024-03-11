package FileHandling.JavaNIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChannelFileCopier {
    public static void main(String[] args) {
        System.out.println("######### Read and Write at the same time ################");

        Path srcPath = Path.of("/home/osman/shortBio");
        Path desPath = Path.of("OsmanBio");

        if(!Files.exists(srcPath)) {
            System.err.println("Source File " + srcPath.getFileName() + " doesn't exist");
            return;
        }
        if(!Files.exists(desPath)) {
            System.err.println("Destination File " + desPath.getFileName() + " doesn't exist");
            try {
                Files.createFile(desPath);
                System.out.println("Destination "+ desPath.getFileName() + " created.");
                
            } catch (IOException ioe) {
                System.out.println("Cannot create file");
            }
            
        }

        try (FileChannel srcChannel = new FileInputStream(srcPath.toFile()).getChannel();
        FileChannel desChannel = new FileOutputStream(desPath.toFile()).getChannel() ) {

            srcChannel.transferTo(0, srcChannel.size(), desChannel);
            
        } catch (IOException ioe) {
            System.err.println(ioe);
        }

    }
}
