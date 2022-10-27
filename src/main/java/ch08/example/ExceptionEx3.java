package ch08.example;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                // 예외 처리됨
                System.out.println("0");
            }
        }
    }
}
