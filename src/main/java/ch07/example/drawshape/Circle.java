package ch07.example.drawshape;

public class Circle extends Shape { // Circle과 Shape는 상속관계
    Point center; // Circle과 Point는 포함 관계(has-a)
    int r;

    Circle() {
        this(new Point(0, 0), 100);
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    // Shape 클래스에서 상속받은 draw()메서드를 오버라이딩
    // 메서드 호출 시 자손이 오버라이딩 한 메서드가 호출됨
    void draw() {
        System.out.printf("[center = (%d, %d), r = %d, color = %s]\n", center.x, center.y, r, color);
    }
}
