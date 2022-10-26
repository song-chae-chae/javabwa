package ch07.example.parser;

public class ParserManager {
    // 리턴타입이 interface => 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}
