package ch08.example;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            // exception 인스턴스 생성 시 생성자에 String 넣어주면 Exception 인스턴스에 메시지로 저장됨
            Exception e = new Exception("고의로 발생");
            throw e; // 예외 발생시킴
            // throw new Exception("고의로 발생") => 이렇게 줄여쓸 수 있음
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
