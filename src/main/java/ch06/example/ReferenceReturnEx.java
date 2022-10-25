package ch06.example;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }
    static Data copy(Data d) { // return 타입이 참조형 -> 메서드가 객체의 주소를 반환한다는 의미
        Data temp = new Data(); // 새로운 객체 temp 생성
        temp.x = d.x; // d.x의 값을 tmp.x에 복사

        return temp; // 복사한 객체의 주소 반환 -> 반환하지 않으면 copy 메서드가 끝나면서 새로운 객체의 참조도 비워지기 때문에 객체를 사용할 방법이 없음
    }
}
