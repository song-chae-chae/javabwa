package ch07.example.deck;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다
        Card c = d.pick(0); // 섞기 전 제일 위의 카드 뽑기
        System.out.println(c);

        d.shuffle(); // 섞기
        c = d.pick(0); // 섞은 후 제일 위의 카드 뽑기
        System.out.println(c);
    }
}
