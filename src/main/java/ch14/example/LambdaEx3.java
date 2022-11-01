package ch14.example;

public class LambdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}

@FunctionalInterface
interface MyFunction3 {
    void myMethod(); // public abstract void myMethod();
}

class Outer {
    int val = 10; // Outer.this.val

    class Inner {
        int val = 30; // this.val

        void method(int i) { // void method(final int i) {
            int val = 30; // final int val = 30;
//            i = 10; // 상수 값 변경 불가
            
            // 람다식 내에서 외부에 선언된 변수에 접근하는 방법
            // 람다식 내에서 참조하는 지역변수는 final이 붙지 않았어도 상수로 간주
            // 람다식 내에서 지역변수 i, val 참조하고 있으므로 람다식 내에서나 다른 어느 곳에서도 변수들의 값 변경하는 일 허용 X
            // 반면 Inner, Outer 클래스의 인스턴스 변수 this.val , Outer.this.val 은 상수로 간주되지 않음
            // 외부 지역변수와 같은 이름의 람다식 매개변수는 허용되지 않음
            MyFunction3 f = () -> {
                System.out.println("             i : " + i);
                System.out.println("           val : " + val);
                System.out.println("      this.val : " + ++this.val);
                System.out.println("Outer.this.val : " + ++Outer.this.val);
            };
            f.myMethod();
        }
    }
}