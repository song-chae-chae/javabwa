package ch06.example;

public class MyMath2 {
    long a, b;
    
    // 인스턴스 변수 a, b만을 이용해 작업하므로 매개변수 필요 없음
    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }
    
    // 인스턴스 변수와 상관없이 매개변수만으로 작업 가능
    // a, b는 지역변수
    static long add(long a, long b) {
        return a + b;
    }
    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}
