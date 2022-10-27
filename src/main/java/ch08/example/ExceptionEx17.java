package ch08.example;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외 처리");
        }
    }
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외 처리됨");
            throw e; // 다시 예외 발생
        }
    }
}
