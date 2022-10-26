package ch07.example.super1;

public class Child extends Parent{
    void method() {
        // super : 자손 클래스에서 조상 클래스로부터 상속받은 멤버 참조하는데 사용되는 참조 변수
        // 상속받은 멤버와 자신의 멤버 이름 같을 때는 super로 구별 가능
        // 조상과 자손의 멤버 중복 정의되어 서로 구별하는 경우에 사용
        // 중복되지 않은 경우 super와 this는 근본적으로 같음
        // 모든 인스턴스 메서드에는 자신이 속한 인스턴스의 주소가 지역변수로 저장되는데 이것이 참조변수인 this, super의 값이 됨
        // static 메서드는 인스턴스와 관련 없으므로 super도 static 메서드에서는 사용 불가

        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
