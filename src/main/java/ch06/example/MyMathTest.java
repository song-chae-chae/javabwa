package ch06.example;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        // 자동형변환 되는 경우 매개변수에 다른 타입 넣어도 됨 (ex) long 대신 int)
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}
