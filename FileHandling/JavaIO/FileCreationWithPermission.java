package FileHandling.JavaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class FileCreationWithPermission {
    public static void main(String[] args) throws IOException {
        System.out.println("************* Create File/Directory with specific permission ******************");
        Path path = Path.of("DirPermisn");
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rwxr--r--");

        FileAttribute<Set<PosixFilePermission>> fileAttribute = PosixFilePermissions.asFileAttribute(permissions);

        if(!Files.exists(path)) {
            Files.createDirectory(path, fileAttribute);

        }
        
        Set<PosixFilePermission> getDirPermisn = Files.getPosixFilePermissions(path);
        System.out.println(getDirPermisn);
    }
}
