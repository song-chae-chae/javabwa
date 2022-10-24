package ch05.example;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        int temp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45); // 0 ~ 44 범위의 임의의 값
            // 1 ~ 45까지의 수를 6번 뽑아서 맨 처음 6개와 서로 바꿔준다.
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d\n", i, ball[i]);
        }
    }
}
