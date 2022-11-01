package ch12.example.fruitBox2;

// Box<T>를 상속받고 FruitBox 안에는 Fruit를 상속받고, Eatable을 구현한 클래스만 들어올 수 있다
public class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}
