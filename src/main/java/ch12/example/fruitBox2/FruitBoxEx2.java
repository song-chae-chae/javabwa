package ch12.example.fruitBox2;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 타입 불일치
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // Apple 자손 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox - " + fruitBox);
        System.out.println("appleBox - " + appleBox);
        System.out.println("grapeBox -" + grapeBox);
    }
}
