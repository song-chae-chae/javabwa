package ch05;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        // int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1 ~ 10 숫자 순서대로 배열에 넣음
        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1; // 1 ~ 10의 값 배열에 저장
        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2)); // [요소1, 요소2, ...]
        System.out.println(Arrays.toString(iArr3)); // [요소1, 요소2, ...]
        System.out.println(Arrays.toString(chArr)); // [요소1, 요소2, ...]
        System.out.println(iArr3); // 타입@주소 형식으로 출력
        System.out.println(chArr); // char 배열은 println으로 출력할 때, 각 요소 구분자 없이 그대로 출력됨
    }
}
