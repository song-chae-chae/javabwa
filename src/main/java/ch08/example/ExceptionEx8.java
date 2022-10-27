package ch08.example;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행 안됨
        } catch (ArithmeticException ae) { // 처리하고자 하는 예외와 같은 타입의 참조변수 하나 선언
            // 예외 발생 시, 발생한 예외에 해당하는 클래스의 인스턴스 마들어짐
            ae.printStackTrace(); // 예외 발생 당시의 callstack에 있던 메서드의 정보, 예외 메시지 화면에 출력
            System.out.println("예외 메시지 : " + ae.getMessage()); // 발생한 예외 클래스의 인스턴스에 저장된 메시지
        }
        System.out.println(6);
    }
}
