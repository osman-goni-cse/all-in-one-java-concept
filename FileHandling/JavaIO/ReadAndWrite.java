package FileHandling.JavaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/home/osman/shortBio");
        String myBio = Files.readString(path);

        System.out.println(myBio);

        Files.writeString(path, "Osman Goni @Lead AI");

        Path photoPath = Path.of("/home/osman/Pictures/osmangoni.jpg");
        byte[] allBytes = Files.readAllBytes(photoPath);

        System.out.println(allBytes);

    }
}
