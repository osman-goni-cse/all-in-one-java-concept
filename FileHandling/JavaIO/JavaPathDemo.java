package FileHandling.JavaIO;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class JavaPathDemo {
    public static void main(String[] args) {
        System.out.println("************** Everything about Path in java *************");

        Path path = Path.of("\\home\\osman\\Pictures\\osmangoni.jpg");
        System.out.println(path);

        File file = path.toFile();
        System.out.println(file);

        File file2 = new File("/home/osman/Pictures/osmangoni.jpg");

        System.out.println(file2);

        Path path2 = Path.of("Hello.txt");
        File file3 = path2.toFile();
        File file4 = new File("Hwo.txt");

        System.out.println(path2);
        System.out.println(file3);
        System.out.println(file4);

        String workingDir = System.getProperty("user.dir");
        String newFile = workingDir + File.separator + "helloworld.txt";
        File file5 = new File( newFile);
        System.out.println(newFile);
        System.out.println(file5);

        Path myWorkingDir = Path.of("/", "home", "osman", "SpringProjects");
        System.out.println(myWorkingDir);

        boolean exists = Files.exists(myWorkingDir);
        System.out.println("Exists: " + exists);

        exists = file2.exists();
        System.out.println("exists: " + exists);

        Path path3 = Path.of("/home/osman/JavaProjects/CollectionFrameworkTutorial");

        System.out.println("is Directory " + Files.isDirectory(path3));
    }
}
