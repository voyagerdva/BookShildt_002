package e0089_IO_4_util_for_handle_txt_files_by_lines;

import java.io.*;
import java.util.ArrayList;

public class Handling {

    java.util.List<String> rows = new ArrayList<>();
    String row;
    File fileIn = new File("e:\\TMP\\TEST_FILE.txt");
    File fileOut = new File("e:\\TMP\\TEST_FILE_OUT.txt");

    public void readFromFile() {
        try (FileReader fr = new FileReader(fileIn);
             BufferedReader reader = new BufferedReader(fr)) {

            do {
                row = reader.readLine();
                rows.add(row);
            } while (row != null);

                rows.remove(rows.size() - 1);

        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void writeToFile() {
        try (FileWriter fw = new FileWriter(fileOut);
             BufferedWriter writer = new BufferedWriter(fw)) {

            rows.forEach(r -> {
                try {
                    row = modifyRows(r);
                    writer.write(row + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String modifyRows(String row) {
        if (row != null) {
            row = row.replace('i', 'I');
            row = row.replace('a', 'A');
            row = row.replace(';', '<');
            row = row.replace('e', 'E');
        }
        return ("HANDLED > " + row);
    }
}
