package ch05;

public class ArrayEx1 {
    public static void main(String[] args) {
        // int[] score : 배열을 다루기 위한 참조변수를 위한 공간이 만들어지는 것
        // new int[5] : 연산자 new 에 의해 메모리의 빈 공간에 5개의 int형 데이터를 저장할 공간이 생김
        // = : 배열의 주소가 int형 배열 참조변수 score에 저장됨
        // -> score 는 배열의 주소를 들고있는 참조변수일 뿐이다.
        // int[] score = new int[0] 가능
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70; // score[2]
        score[3] = 80;
        score[4] = 90;

        int temp = score[k + 2] + score[4]; // temp = score[3] + score[4]

        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d] : %d\n", i, score[i]);
        }
        System.out.printf("temp : %d\n", temp);
        System.out.printf("score[%d] : %d\n", 7, score[7]); // index 범위 벗어난 값 -> ArrayIndexOutOfBoundsException
    }
}

