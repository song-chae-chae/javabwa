package ch07.example.casting;

public class CastingTest {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe; 에서 형변환 생략 (업캐스팅)
        // car.water(); -> error why? 조상타입으로 캐스팅했기때문에 조상은 water 기능 없음
        // 원래는 더 많은걸 할수 있더라도 현재 담긴 그릇에 없는 멤버는 사용할 수 없음

        fe2 = (FireEngine)car; // 형변환 생략 불가 (다운캐스팅)
        // 조상 타입 -> 자손 타입
        fe2.water();
    }

}
