package ch15.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter(args[1]);

        int data = 0;

        while ((data = fr.read()) != -1) {
            if (data != '\t' && data != '\n' && data != ' ' && data != '\r')
                fw.write(data);
        }

        fr.close();
        fw.close();
    }
}
