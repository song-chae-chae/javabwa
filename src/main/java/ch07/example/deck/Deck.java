package ch07.example.deck;

public class Deck {
    final int CARD_NUM = 52; // 카드 개수
    Card[] cardArr = new Card[CARD_NUM]; // Card 객체 배열 포함

    Deck() { // Deck의 카드 초기화
        int i = 0;

        for (int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n + 1);
            }
        }
    }

    Card pick(int index) { // 지정된 위치에 있는 카드 하나 꺼내서 반환
        return cardArr[index];
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}
