package ch09.example;

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf('.'); // '.'의 위치

        String fileName = fullName.substring(0, index); // 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출
        String ext = fullName.substring(index+1);

        System.out.println(fullName + " 의 확장자를 제외한 이름은 " + fileName);
        System.out.println(fullName + " 의 확장자는 " + ext);
    }
}
