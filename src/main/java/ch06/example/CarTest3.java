package ch06.example;

public class CarTest3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1); // c1의 복사본 c2 생성
        // c2는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만 서로 독립적으로 메모리 공간에 존재하는 별도의 인스턴스(new를 통해 새로 만들었음) 이므로 c1의 값이 변경되는 것과 c2는 무관하다

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

        c1.door = 1000;

        System.out.println("c1.door = 1000 수행 후");
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4);
    }

    Car3(Car3 c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}