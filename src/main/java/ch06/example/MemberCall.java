package ch06.example;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv; 클래스 변수는 인스턴스 변수 사용 불가
    static int cv2 = new MemberCall().iv; // 객체 생성해야 참조 가능

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv); -> 클래스 메서드에서 인스턴스 변수 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv); // 객체 생성후에야 인스턴스 변수 참조 가능
    }
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 인스턴스메서드는 staic, instance 변수 둘 다 사용 가능
    }
    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); 클래스 메서드에서 인스턴스 메서드 호출 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 객체 생성 후에 호출 가능
    }
    void instanceMethod2() {
        staticMethod1(); // 인스턴스, 스태틱 메서드 인스턴스 생성 없이 둘 다 호출 가능 -> 이미 이 메서드를 호출하는 것부터가 인스턴스가 생성되어 있다는 뜻이기 때문
        instanceMethod1();
    }
}
