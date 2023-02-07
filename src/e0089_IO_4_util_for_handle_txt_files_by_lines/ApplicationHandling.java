package e0089_IO_4_util_for_handle_txt_files_by_lines;

import java.io.*;

public class ApplicationHandling {
    public static void main(String[] args) throws IOException {
        Handling handling = new Handling();
        handling.readFromFile();
        handling.writeToFile();
    }
}
