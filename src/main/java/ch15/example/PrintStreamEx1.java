package ch15.example;

import java.util.Date;

public class PrintStreamEx1 {
    public static void main(String[] args) {
        int i = 65;
        float f = 1234.56789f;

        Date d = new Date();

        System.out.printf("문자 %c 코드 : %d%n", i, i);
        System.out.printf("%d 8진수로 %o, 16진수로 %x%n", i, i, i);
        System.out.printf("%3d%3d%3d%n", 100, 90, 80);
        System.out.println();
        System.out.printf("123456789012345678901234567890%n");
        System.out.printf("%s%-5s%5s%n", "123", "123", "123");
        System.out.println();
        System.out.printf("%-8.1f%-8.1f %e%n", f, f, f);
        System.out.println();
        System.out.printf("오늘은 %tY년 %tM월 %tD일%n", d, d, d);
        System.out.printf("오늘은 %tH:%tM:%tS%n", d, d, d);
        System.out.printf("오늘은 %1$tH:%1$tM:%1$tS%n", d);
    }
}
