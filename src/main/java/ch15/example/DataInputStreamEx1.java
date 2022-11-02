package ch15.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("sample.dat");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
        System.out.println(dis.readBoolean());

        dis.close();
    }
}
