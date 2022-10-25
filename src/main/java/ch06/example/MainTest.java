package ch06.example;

public class MainTest {
    public static void main(String[] args) {
        main(null); // 무한 호출 -> 호출스택에 계속 쌓이기만 하니까 StackOverflowError 발생
        // 재귀 호출할 때는 중단 조건 있어야 함
    }
}
