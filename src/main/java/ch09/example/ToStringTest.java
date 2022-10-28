package ch09.example;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("KOREA");
        Date today = new Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString()); // date클래스의 tostring은 오버라이딩 되어있음
    }
}
