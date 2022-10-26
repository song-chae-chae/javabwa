package ch07.example.binding3;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x); // 100
        p.method(); // Child 클래스의 method 호출됨
        System.out.println();
        System.out.println("c.x = " + c.x); // 200
        c.method(); // Child 클래스의 method 호출됨
    }
}
