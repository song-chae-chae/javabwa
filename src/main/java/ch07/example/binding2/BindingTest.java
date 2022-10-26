package ch07.example.binding2;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        // 조상과 자식간 멤버 중복되지 않는 경우는 조상 멤버 호출 시 자동으로 조상 멤버 호출됨
        System.out.println("p.x = " + p.x); // 100
        p.method(); // parent
        System.out.println("c.x = " + c.x); // 100
        c.method(); // parent
    }
}
