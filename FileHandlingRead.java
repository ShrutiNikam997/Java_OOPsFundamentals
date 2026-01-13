import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileHandlingRead {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Folder path");
        String folderPath = sc.nextLine();

        System.out.println("Enter file name u want to read : ");
        String fileName = sc.nextLine();

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
            FileReader fr = new FileReader(file);
            Scanner fileScanner = new Scanner(fr);

            System.out.println("-----------File Content----------");
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}