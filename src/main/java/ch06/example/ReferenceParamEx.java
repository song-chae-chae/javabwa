package ch06.example;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x); // 1000
    }

    static void change(Data d) { // 참조형 매개변수
        // 참조형 매개변수는 값 읽기, 변경하기 다 가능
        // 참조형 매개변수 d가 메모리에 올라왔다가 change 메서드 끝나면 스택에서 제거됨 -> main에서 인스턴스 만든거를 가리키는 참조변수가 2개가 되었다가 하나는 메서드 끝나고 사라짐
        d.x = 1000;
        System.out.println("change() : x = " + d.x); // 1000
    }
}
