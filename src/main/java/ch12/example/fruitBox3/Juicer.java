package ch12.example.fruitBox3;

public class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String temp = "";
        for (Fruit f : box.getList()) {
            temp += f + " ";
        }
        return new Juice(temp);
    }
}
