package ch14.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaEx6 {
    public static void main(String[] args) {
        IntSupplier s = () -> (int) (Math.random() * 100) + 1;
        IntConsumer c = i -> System.out.print(i + ", ");
        IntPredicate p = i -> i % 2 == 0;
        IntUnaryOperator op = i -> i / 10 * 10; // IntUnaryOperator 대신 Function 사용하면 에러 -> 매개변수와 반환값의 타입 추정 못해서
        // -> 타입 지정해줘야 함 IntFunction<Integer, Integer> f = (a) -> 2 * a;
        // IntUnaryOperator 가 오토박싱, 언박싱 횟수 줄어들어서 더 좋음
        // 매개변수, 반환 타입 일치하면 UnaryOperator 사용하는게 좋음

        int[] arr = new int[10];

        makeRandomList(s, arr);
        System.out.println(Arrays.toString(arr));
        printEvenNum(p, c, arr);
        int[] newArr = doSomething(op, arr);
        System.out.println(Arrays.toString(newArr));
    }

    static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
        System.out.print("[");

        for (int i : arr) {
            if (p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    static void makeRandomList(IntSupplier s, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.getAsInt();
        }
    }

    static int[] doSomething(IntUnaryOperator op, int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = op.applyAsInt(arr[i]); // apply() 아님
        }

        return newArr;
    }
}
