package ch06.example;

public class MyMath3 {
    // overloading
    // 매개변수 타입, 순서로만 가능 - 매개변수 이름이나 리턴값으로는 구분 X
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("int add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;

        for (int i : a) {
            result += i;
        }
        return result;
    }
}
