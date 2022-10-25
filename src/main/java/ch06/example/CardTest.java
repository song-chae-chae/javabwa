package ch06.example;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card card = new Card();
        card.kind = "Heart";
        card.number = 7;

        Card card2 = new Card();
        card2.kind = "Spade";
        card2.number = 4;

        System.out.println("card는 " + card.kind + "," + card.number + "이며, 크기는 (" + card.width + ", " + card.height + ")");
        System.out.println("card는 " + card2.kind + "," + card2.number + "이며, 크기는 (" + card2.width + ", " + card2.height + ")");

        System.out.println("card1의 width, height를 각각 50, 80으로 변경한다\n");
        card.width = 50; // 참조변수 card를 통해 class변수에 접근할 수는 있지만 instance 변수로 오해할 수 있으니 안하는게 좋다
        card.height = 80;

        System.out.println("card는 " + card.kind + "," + card.number + "이며, 크기는 (" + card.width + ", " + card.height + ")");
        System.out.println("card는 " + card2.kind + "," + card2.number + "이며, 크기는 (" + card2.width + ", " + card2.height + ")");
    }
}
