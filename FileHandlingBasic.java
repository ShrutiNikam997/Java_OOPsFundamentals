import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileHandlingBasic {
    public static void main(String argsp[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter folder path");
        String folderPath = sc.nextLine();

        System.out.println("Enter file name");
        String fileName = sc.nextLine();

        File folder = new File(folderPath);

        if (!folder.exists()) {
            System.out.println("Folder does not exists");
            sc.close();
            return;
        }

        File file = new File(folderPath + File.separator + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exixts");
            }

            System.out.println("File name :" + file.getName());
            System.out.println("Absolute path :" + file.getAbsolutePath());
            System.out.println("Readable :" + file.canRead());
            System.out.println("Writtable :" + file.canWrite());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}