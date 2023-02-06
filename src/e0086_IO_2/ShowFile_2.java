import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile_2 {
    public static void main(String[] args) {
        int i;

        FileInputStream fin;



        if (args.length != 1) {
            System.out.println("USING: ShowFile file_name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println( (char)i);
                }
            } while (i != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fin.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
