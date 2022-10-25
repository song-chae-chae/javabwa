package ch06.example;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x); // 10

    }

    static void change(int x) { // 기본형 매개변수
        // 기본형 매개변수는 변수에 저장된 값을 읽을수만 있음 - 변경 불가
        x = 1000; // d.x를 복사해서 매개변수 x에 저장한 것이기 때문에 x만 변경되었을 뿐임
        System.out.println("change() : x = " + x); // 1000
    }
}
