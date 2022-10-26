package ch07.example.polyArgument3;

public class Tv extends Product {
    Tv() {
        // 조상클래스 생성자 Product(int price) 호출
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}
