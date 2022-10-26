package ch07.example.defaultMethod;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1(); // child가 method1 오버라이드 하고 있으니까 child꺼 호출됨
        c.method2(); // parent랑 interface 겹치면 상속된게 호출됨
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
