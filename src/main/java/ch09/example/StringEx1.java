package ch09.example;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));

        System.out.println();

        String str3 = new String("\"abc\";");
        String str4 = new String("\"abc\";");

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str1 == str2 ? " + (str3 == str4)); // 인스턴스 주소를 등가비교 하면 false
        System.out.println("str1.equals(str2) ? " + str3.equals(str4)); // equals는 값 비교하도록 되어있으므로 true

    }
}
