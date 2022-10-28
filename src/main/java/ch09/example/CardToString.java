package ch09.example;

public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString()); // 클래스 이름과 해시코드 출력됨
        System.out.println(c2.toString());
    }
}

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);

    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}