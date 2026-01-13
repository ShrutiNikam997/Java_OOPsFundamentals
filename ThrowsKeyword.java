/*throw → actually throws the exception

throws → declares the exception*/

import java.io.IOException;

public class ThrowsKeyword {

    static void Readfile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String args[]) {
        try {
            Readfile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues");
    }
}