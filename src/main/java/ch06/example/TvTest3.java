package ch06.example;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 채널 값은 " + t1.channel);
        System.out.println("t2의 채널 값은 " + t2.channel);

        t2 = t1; // t1이 가지고 있는 인스턴스 주소값을 t2에 저장 -> t2가 원래 가지고 있던 인스턴스와의 참조는 끊어짐
        // 2개의 참조변수가 하나의 인스턴스를 바라보고 있음
        t1.channel = 7;

        System.out.println("t1의 채널 값을 7로 변경");

        System.out.println("t1의 채널 값은 " + t1.channel);
        System.out.println("t2의 채널 값은 " + t2.channel);
    }
}
