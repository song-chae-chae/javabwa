package ch07.example.polyArgument3;

import java.util.Vector;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();
    int i = 0; // Product[]에 사용될 카운터

    // 매개변수로 Product를 받아서 Product의 자손들을 한번에 처리할 수 있게되었음
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);

        System.out.println(p + "을/를 구입");
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else { // 제거 실패
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입 제품 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : "," + p;
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
