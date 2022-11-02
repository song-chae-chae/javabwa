package ch15.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = null;
        FileOutputStream fos = null;

        fos = new FileOutputStream("test.txt");
        ps = new PrintStream(fos);
        System.setOut(ps);

        System.out.println("hello by system.out");
        System.err.println("hello by system.err");
    }


}
