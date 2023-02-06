package e0087_IO_3_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        String filenameIN = "./__SOURCE__/FIRST.txt";
        String filenameOUT = "./__SOURCE__/SECOND.txt";

        if (filenameIN == null || filenameOUT == null) {
            System.out.println("USING: CopyFile from where...");
            return;
        }

        try {
            fin = new FileInputStream(filenameIN);
            fout = new FileOutputStream(filenameOUT);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException eIn) {
                eIn.printStackTrace();
            }

            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException eOut) {
                eOut.printStackTrace();
            }
        }


    }
}
