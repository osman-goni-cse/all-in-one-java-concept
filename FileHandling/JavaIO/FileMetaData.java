package FileHandling.JavaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FileMetaData {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("/home/osman/Pictures/osmangoni.jpg");
        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = attr.creationTime();

        System.out.println("Creation Time: " + creationTime);

        FileTime lastModifiedTime = attr.lastModifiedTime();
        System.out.println("Last Modified Time: " + lastModifiedTime);

        long size = attr.size();
        System.out.println("size = " + size);

        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner : " + owner);

    }
}
