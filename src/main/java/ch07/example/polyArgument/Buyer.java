package ch07.example.polyArgument;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // 매개변수로 Product를 받아서 Product의 자손들을 한번에 처리할 수 있게되었음
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입");
    }
}
