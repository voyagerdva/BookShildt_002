package e0090_String_split.e0089_IO_4_util_for_handle_txt_files_by_lines;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        String[][] words = new String[0][];
        String[] arr;
        String str1 = "1T,111-111-222,Kirry1,4T,200F,400F";
        String str2 = "2T,111-111-222,Kirry2,4T,200F,400F";
        String str3 = "3T,111-111-222,Kirry3,4T,200F,400F";
        String str4 = "4T,111-111-222,Kirry4,4T,200F,400F";

        words[0] = str1.split(",");

    }
}
