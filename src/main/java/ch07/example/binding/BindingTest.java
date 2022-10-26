package ch07.example.binding;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        // 멤버변수가 조상과 자손에 중복 정의된 경우
        // 조상타입의 참조변수를 사용했을 때 조상에 선언된 멤버변수가 사용
        // 자손타입의 참조변수 사용했을 때 자손에 선언된 멤버변수가 사용됨

        // but 메서드는 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드가 호출됨
        // 실제 인스턴스는 child 이기 때문에 p.method(), c.method() 둘 다 child를 print

        System.out.println("p.x = " + p.x); // 100
        p.method(); // child
        System.out.println("c.x = " + c.x); // 200
        c.method(); // child
    }
}
