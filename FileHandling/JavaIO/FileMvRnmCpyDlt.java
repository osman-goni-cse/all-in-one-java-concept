package FileHandling.JavaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileMvRnmCpyDlt {
    public static void main(String[] args) throws IOException {
        System.out.println(" ***** File Move/Rename/Copy/Delete in java **********");

        Path oldPath = Path.of("newFile.txt");
        Path targetPath = Path.of("renamedNewFile.txt");

        try {
            Path moved = Files.move(oldPath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(moved);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        boolean fileDel = Files.deleteIfExists(targetPath);
        if(fileDel) {
            System.out.println("File Deleted Successfully.");
        }
    }
}
