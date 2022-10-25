package ch06.example;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]");
    }
    // 가변인자 : 매개변수의 개수를 고정하지 않고 원하는 만큼 인수로 넣을 수 있음
    // 인수 없어도 되고 배열도 인자가 될 수 있음
    // 내부적으로 배열을 이용 -> 가변인자가 선언된 메서드 호출할 대마다 배열 새로 생성됨 --> 비효율적이니까 잘 사용하기
    // 매개변수 타입을 배열로 하는것과 뭐가 다름?
    // -> 매개변수 타입을 배열로 하면 무조건 빈 배열, null이라도 넣어줘야 하는데
    // 가변인자를 사용하면 매개변수 안넣어도 에러 안남
    static String concatenate(String delimiter, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delimiter;
        }
        return result;
    }
}
