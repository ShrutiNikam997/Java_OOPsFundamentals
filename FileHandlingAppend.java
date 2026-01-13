import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHandlingAppend {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Folder path");
        String folderPath = sc.nextLine();

        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.println("Enter text to Append in the file");
        String text = sc.nextLine();

        File folder = new File(folderPath);
        if (!folder.exists()) {
            System.out.println("folder does not exists.");
            sc.close();
            return;
        }

        File file = new File(folderPath + File.separator + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e)

        {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(text + System.lineSeparator());
            fw.close();

            System.out.println("Data Append successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}