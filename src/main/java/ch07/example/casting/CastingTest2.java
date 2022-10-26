package ch07.example.casting;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();

        // fe = (FireEngine)car; error -> 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않음
        // Car car = new FireEngine(); -> 이었다면 형변환 가능
        // fe.drive();
        // car2 = fe;
        // car2.drive();
    }
}
