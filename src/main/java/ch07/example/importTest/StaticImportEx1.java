package ch07.example.importTest;

import static java.lang.Math.PI; // import static : 스태틱 멤버 호출 시 클래스 이름 생략 가능
import static java.lang.System.out;

public class StaticImportEx1 {
    public static void main(String[] args) {
        out.println(Math.random());
        out.println("Math.PI : " + PI);
    }
}
