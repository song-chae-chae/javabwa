package ch06.example;

public class Card {
    String kind; // 인스턴스 변수
    int number;  // 인스턴스 변수
    static int width = 100; // class 변수
    static int height = 250; // class 변수

    // class 변수 method area에 생성되며, 한 클래스의 모든 인스턴스들이 공통적인 값을 유지하는 경우 사용됨
    // 인스턴스 생성하지 않고도 사용가능
    // 클래스가 메모리에 로딩될 때 생성되어 프로그램 종료될 때까지 유지됨
    // 인스턴스 멤버와 상관없이 사용되어야 함
    // -> 클래스멤버는 인스턴스의 생성 없이도 클래스 자체만으로 사용이 가능한데 만약 인스턴스의 생성이 되지 않은 상황에서 클래스 멤버가 인스턴스에 접근하려 하면 에러 발생하기 때문
}
