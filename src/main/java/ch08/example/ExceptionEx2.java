package ch08.example;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int)(Math.random() * 10); // error 발생 라인 Exception in thread "main" java.lang.ArithmeticException: / by zero
                                                         // at ch08.example.ExceptionEx2.main(ExceptionEx2.java:9)
            System.out.println(result);
        }
    }
}
