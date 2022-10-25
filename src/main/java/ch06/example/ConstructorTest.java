package ch06.example;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        // Data2 d2 = new Data2(); // compile error
        Data2 d2 = new Data2(3);
    }
}
class Data1 {
    int value;
}
class Data2 {
    int value;

    // 모든 클래스는 하나 이상의 생성자가 정의되어 있어야 하고
    // 생성자 없는 경우 컴파일러가 기본 생성자 제공함
    // Data2() {} -> 이게 기본 생성자
    // 기본 생성자 제공하는건 생성자 1개도 없을때 뿐임
    // 메서드와 유사하지만 리턴값 없음
    // 생성자 이름은 클래스 이름과 같음
    // 생성자는 인스턴스 변수들의 초기화에 사용되는 특별한 메서드일 뿐
    // 인스턴스를 생성하는건 new 연산자!
    Data2(int x) { // 매개변수 있는 생성자
        value = x;
    }
}
