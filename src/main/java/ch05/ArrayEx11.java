package ch05;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10); // 0 ~ 9 임의의 수 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            // counter[numArr[1]]++
            // numArr[1] = 4일 때 => counter[4]++ => counter[4] = counter[4] + 1;
            counter[numArr[i]]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }
}
