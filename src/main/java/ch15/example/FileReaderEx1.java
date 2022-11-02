package ch15.example;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        FileInputStream fis = new FileInputStream(fileName);
        FileReader fr = new FileReader(fileName);

        int data = 0;

        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println();
        fis.close();

        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println();
        fr.close();
    }
}
