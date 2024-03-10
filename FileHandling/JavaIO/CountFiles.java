package FileHandling.JavaIO;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class CountFiles {
    public static void main(String[] args) throws IOException {
        System.out.println("*********** List of Files in a directory *******************");

        Path pictureDir = Path.of("/home/osman/Pictures");

        Stream<Path> paths = Files.list(pictureDir);

        System.out.println("########################## Listing using Files Class #######################");
        paths.forEach(file -> {
            System.out.println(file);
        });

        File[] countFiles = pictureDir.toFile().listFiles();

        System.out.println(" ******************* Using File *****************");
        for(File file: countFiles) {
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("############### File Filtering ##########################");

        FileFilter pngFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String filename = pathname.getName();
                return filename.endsWith(".png");
            }
        };

        File[] pngFiles = pictureDir.toFile().listFiles(pngFilter);

        for(File file: pngFiles) {
            System.out.println(file);
        }

        System.out.println(" ********** Walking in subdirectory also *****************");

        Stream<Path> walk = Files.walk(pictureDir);

        walk.forEach(file -> {
            System.out.println(file);
        });
    }
}
