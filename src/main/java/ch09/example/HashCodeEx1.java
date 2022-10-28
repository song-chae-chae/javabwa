package ch09.example;

public class HashCodeEx1 {
    public static void main(String[] args) {
        String st1 = new String("abc");
        String st2 = new String("abc");

        System.out.println(st1.equals(st2)); // 문자열 내용 같으면 true로 오버라이딩 되어있음
        System.out.println(st1.hashCode()); // 문자열 내용이 같으면 해시코드 동일하게 리턴
        System.out.println(st2.hashCode());
        System.out.println(System.identityHashCode(st1)); // 객체 주소값으로 해시코드 생성 -> 다른 객체인지 판단 가능
        System.out.println(System.identityHashCode(st2));
    }
}
