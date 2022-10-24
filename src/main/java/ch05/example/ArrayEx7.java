package ch05.example;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 10); // 0 ~ 9 중 한 값을 임의로 얻는다.
            // i번째와 n번째 값을 서로 바꾸는거를 100번 반복 -> 값이 다 섞이게 됨
            int temp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = temp;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
