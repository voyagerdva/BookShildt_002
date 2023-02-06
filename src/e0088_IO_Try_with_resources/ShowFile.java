package e0088_IO_Try_with_resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;

        String filenameIn = "./__SOURCE__/THIRD.txt";
        String filenameOut = "./__SOURCE__/THIRD_COPY.txt";

        if (filenameIn == null || filenameOut == null) {
            System.out.println("USING: CopyFile from where...");
            return;
        }

        try (FileInputStream fin = new FileInputStream(filenameIn);
             FileOutputStream fout = new FileOutputStream(filenameOut)) {

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                    fout.write(i);
                }
            } while (i != -1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
