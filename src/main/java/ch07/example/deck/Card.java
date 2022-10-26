package ch07.example.deck;

public class Card {
    static final int KIND_MAX = 4; // 카드 무늬 수
    static final int NUM_MAX = 13; // 무늬별 카드 개수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // Card 객체를 print 했을 때 toString()이 실행되어 인스턴스의 정보를 문자열로 반환한다
    // toString()없으면 Card 객체 print 시 객체의 주소가 반환된다.
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 x로 표현

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
