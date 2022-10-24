package ch05.example;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }

        for (int[] temp : score) { // score의 각 요소(1차원 배열 주소)를 temp에 저장
            for (int i : temp) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
