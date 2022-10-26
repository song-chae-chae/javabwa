package ch07.example.super2;

public class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x); // 자손의 x
        System.out.println("super.x = " + super.x); // 부모의 x
    }
}
