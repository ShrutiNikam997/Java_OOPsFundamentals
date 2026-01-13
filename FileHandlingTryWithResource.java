import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class FileHandlingTryWithResource {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the folder path");
        String folderpath = sc.nextLine();

        System.out.println("Enter the file name");
        String filename = sc.nextLine();

        System.out.println("Enter the text u want to write : ");
        String text = sc.nextLine();

        File folderPath = new File(folderpath);

        if (!folderPath.exists()) {
            System.out.println("Folder not found");
            sc.close();
            return;

        }
        File file = new File(folderPath + File.separator + filename);

        try {
            if (file.createNewFile()) {
                System.out.println("File successfully created");
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------File Writing using try with Resourse-----------");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(text);
            bw.newLine();

            System.out.println("Data written succesffully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------File reading using try with Resource------------");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}