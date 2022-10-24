package ch05.example;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 0 ~ 9 사이의 임의의 값 10개, 버블 정렬 알고리즘으로 크기 순 정렬
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        // 버블 정렬 : 배열의 길이가 n일 때 첫번째부터 n - 1까지의 요소에 대해 근접한 값과 크기를 비교하여 자리바꿈을 반복하는 정렬방법 (n-1번, n-2번, n-3번, n-4번 ..., 1)까지 정렬
        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true;
                }
            }
            if (!changed) break;
            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
