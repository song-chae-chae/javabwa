package ch07.example.singleton;

public class SingletonTest {
    // Singleton s = new Singleton(); -> error / 생성자에 private 붙어있어 외부에서 생성 불가
    Singleton s = Singleton.getInstance();
}
