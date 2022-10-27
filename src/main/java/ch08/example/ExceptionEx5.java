package ch08.example;

public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0); // exception 발생
            System.out.println(4); // 실행 안됨
        } catch (ArithmeticException e) {
            System.out.println(5); // 실행됨
        }
        System.out.println(6); // 실행됨
    }
}
