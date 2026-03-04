package OthersProgram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class P2 {
    public static void main(String[] args) {
        // Move the File one Folder to Another Folder
        Path source = Paths.get("C:\\Users\\STM\\git\\repository5\\Java8FeaturePractice\\Hitesh.txt");
        Path destination = Paths.get("C:\\Users\\STM\\git\\repository5\\Java8FeaturePractice\\Folder");

        try {
            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
