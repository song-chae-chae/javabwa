package ch10.example;


import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90}; // 경계값 : 오름차순
        String[] grades = {"D", "C", "B", "A"}; // 치환될 문자열 개수는 경계값에 의해 정의된 범위의 개수와 일치해야 함
        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
