package ch12.example.fruitBox;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<>();
        // Box<Grape> grapeBox = new Box<Apple>(); // error 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // void add(Fruit item)

        appleBox.add(new Apple());
        // appleBox.add(new Toy); // error Apple만 담을 수 있음
        // appleBox.add(new Fruit()); // error 조상도 안됨

        toyBox.add(new Toy());
        // toyBox.add(new Apple());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}

