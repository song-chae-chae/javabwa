package ch06.example;

public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4); // Car2(String color, String gearType, int door) 생성자 호출
    }

    Car2(String color) {
        // 생성자에서 다른 생성자 호출
        // 생성자의 이름으로 클래스 이름 대신 this 사용함
        // 한 생성자에서 다른 생성자 호출 시 반드시 첫 줄이어야 함 -> 생성자는 멤버변수 초기화하는데 사용되는데 생성자 호출 전에 다른 초기화 작업하면 그게 무의미해질 수 있음
        this(color, "auto", 4);
    }

    
    Car2(String color, String gearType, int door) {
        this.color = color; // this : 참조변수로 인스턴스 자신을 가리킴 (모든 인스턴스 메서드에 지역변수로 숨겨진 채 존재) (this() - 이건 생성자임 this 와 this() 는 다름 주의)
        this.gearType = gearType;
        this.door = door;
    }
}
