package ch07.example.innerEx;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 외부 클래스의 private 멤버도 접근 가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // int siv = outerIv; error 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없음
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0; // final 생략 가능

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;

            // 외부 클래스의 지역변수는 final이 붙은 변수만 가능했으나 jdk1.8 부터 다 가능
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
