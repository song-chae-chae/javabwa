package ch15.example;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
    public static void main(String[] args) throws IOException {
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data = 0;
        while((data = input.read()) != -1) {
            output.write(data);
        }

        System.out.println("Input Data : " + inputData);
        System.out.println("output Data : " + output.toString());
        System.out.println("output Data : " + output.getBuffer().toString());
    }
}
