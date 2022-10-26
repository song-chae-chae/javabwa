package ch07.example.parser;

public class HTMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML parsing completed");
    }
}
