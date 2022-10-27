package ch08.example;

public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException(); // RuntimeException 고의 발생
        // 예외처리 하지 않았어도 컴파일 성공
        // 실행 시 RuntimeException 발생해 비정상 종료됨
        // RuntimeException은 프로그래머의 실수로 인해 발생하는 것들이라 예외처리가 강제되지 않아 컴파일까진 성공
    }
}
