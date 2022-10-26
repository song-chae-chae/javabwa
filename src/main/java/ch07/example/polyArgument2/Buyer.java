package ch07.example.polyArgument2;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0; // Product[]에 사용될 카운터

    // 매개변수로 Product를 받아서 Product의 자손들을 한번에 처리할 수 있게되었음
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;

        System.out.println(p + "을/를 구입");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) break;

            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
