package ch07.example.parser;

public class ParserTest {
    public static void main(String[] args) {
        // 인터페이스를 클래스가 구현했을 때, 인스턴스를 인터페이스 타입의 참조변수로 참조하는 것이 가능함
        // -> 인터페이스 타입을 매개변수로 받는 것은 인터페이스를 구현한 클래스의 인스턴스를 받는다는 소리임
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
