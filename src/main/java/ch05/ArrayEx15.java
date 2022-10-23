package ch05;

public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--.."};
        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A']; // 글자가 A로부터 얼마나 떨어져있는지 체크해서 해당하는 모스 부호 얻기
        }
        System.out.println("source : " + source);
        System.out.println("morse : " + result);
    }
}
