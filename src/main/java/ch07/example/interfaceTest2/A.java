package ch07.example.interfaceTest2;

public class A {
    // 클래스 A가 인터페이스 I를 사용해서 작성되긴 하였으나,
    // 매개변수를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 받아야 함
    // 인터페이스와의 관계만 있지 실제로 B와는 아무런 관계가 없기 때문에
    // 클래스 B가 바뀌어도 A는 영향을 받지 않는다
    // A - B => A - I - B 로 바뀜
    void autoPlay(I i) {
        i.play();
    }
}
