package ch07.example.defaultMethod;

public class Child extends Parent implements MyInterface, MyInterface2{
    public void method1() {
        System.out.println("method1() in Child");
    }
}
