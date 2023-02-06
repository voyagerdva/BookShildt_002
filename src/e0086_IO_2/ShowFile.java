package e0086_IO_2_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        String filename = "e:\\__PROJECT__\\JAVA\\BookShildt_002\\src\\e0086_IO_2\\TEST.txt";

        if (filename == null) {
            System.out.println("USING: ShowFile file_name");
            return;
        }

        try {
            fin = new FileInputStream(filename);

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
