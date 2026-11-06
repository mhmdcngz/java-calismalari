import java.io.*;
import java.util.*;

public class Main {
    static void main() throws IOException {

        File file = new File("sifre.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        String val = "Kodlama vakti";

        FileWriter fwrite = new FileWriter(file, false);
        BufferedWriter bwrite = new BufferedWriter(fwrite);
        bwrite.write(val);
        bwrite.write("\nJava Dersleri");
        bwrite.close();

        FileReader fReader = new FileReader(file);
        String line;

        BufferedReader bReader = new BufferedReader(fReader);
        while ((line=bReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}