package ch07.example.interfaceTest;

public class A {
    // 이 메서드를 작성할 때 B가 이미 작성되어 있어야 함
    // 서로 직접적인 관계를 갖고 있기 때문에 B의 methodB() 선언부가 바뀌면 A에서도 영향을 받음
    public void methodA(B b) {
        b.methodB();
    }
}
