package ch08.example;

public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1 의 수행 마치고 main으로 돌아옴");
    }

    static void method1() {
        try {
            System.out.println("method1 호출");
            return; // 리턴 있어도 finally 수행됨
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1의 finally 블럭 실행");
        }
    }
}
