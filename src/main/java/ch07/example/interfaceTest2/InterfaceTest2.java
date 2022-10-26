package ch07.example.interfaceTest2;

public class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B()); // void autoPlay(I i) 호출
        a.autoPlay(new C()); // void autoPlay(I i) 호출
    }
}
