package IOTextFile.ReadFileExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFileExample {

    public void writeFileText(String filePath, ArrayList<String> arr) {
        File f = new File (filePath);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < arr.size(); i++) {
                bw.write(arr.get(i) + "\n");
            }

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
