package ch07.example.innerEx;

class InnerEx2 {
    class InstanceInner {
    }

    static class StaticInner {
    }

    // 인스턴스 멤버 간에는 서로 직접 접근 가능
    InstanceInner iv = new InstanceInner();
    // static 멤버 간에는 서로 직접 접근 가능함
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // static 멤버는 인스턴스 멤버에 직접 접근 불가
        // InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 굳이 접근하려면 외부 클래스 먼저 생성 후 인스턴스 생성해야 함
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        // 인스턴스 메서드에서는 인스턴스 멤버, static 멤버 모두 접근 가능
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // LocalInner lv = new LocalInner(); => error 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가
    }

    void myMethod() {
        class LocalInner {
        }
        LocalInner lv = new LocalInner();
    }
}
