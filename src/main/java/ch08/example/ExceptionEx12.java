package ch08.example;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();
        // Exception in thread "main" java.lang.Exception
        //	at ch08.example.ExceptionEx12.method2(ExceptionEx12.java:11)
        //	at ch08.example.ExceptionEx12.method1(ExceptionEx12.java:8)
        //	at ch08.example.ExceptionEx12.main(ExceptionEx12.java:5)
        // 프로그램 실행 도중 java.lang.Exception 발생하여 비정상 종료
        // 예외 발생 시 call stack의 내용 알수 있음
        // 예외 발생 시 호출 스택에 총 3개의 메서드 -> method2, method1, main 이 있었음
        // 예외가 발생한 곳은 제일 윗 줄에 있는 method2
        // main이 method1 호출 , method1은 method2 호출했음
        // 아무 곳에서도 예외 처리 해주지 않아 프로그램은 비정상 종료
        // throw는 예외를 호출한 곳으로 전달만 한 것이니 꼭 어딘가에선 예외처리 해줘야 함
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
