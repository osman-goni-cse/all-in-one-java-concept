package FileHandling.JavaIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreation {
    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("newFile.txt");

        if(Files.exists(filePath)) {
            System.out.println(filePath.getFileName() + " Already exists.");
        }
        else {
            Path file = Files.createFile(filePath);

            System.out.println(filePath.getFileName() + " file created.");
        }

        File testFilePath = new File("fileCreate.java");
        boolean hasCreated = testFilePath.createNewFile();

        if(hasCreated) {
            System.out.println("File Created Successful");
        }
        else {
            System.out.println("File Not Created");
        }

        Path dirPath = Path.of("TestDirCreation/AnotherDirectory");

        if(!Files.exists(dirPath)) {
            Path directory = Files.createDirectories(dirPath);
            System.out.println(directory + " created successfully.");
        }
        else {
            System.out.println(dirPath.getFileName() + " Already exists.");
        }

        File notRecommended = new File("anotherDummy");
        notRecommended.mkdir();
    }
}
