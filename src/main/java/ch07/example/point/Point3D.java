package ch07.example.point;

public class Point3D extends Point{
    int z;

    Point3D(int x, int y, int z) {
        // 컴파일러가 이 자리에 자동으로 super();를 넣어서 Point 클래스의 기본 생성자를 호출하려고 할텐데
        // Point 클래스에는 기본 생성자 없이 매개변수 받는 생성자밖에 없음
        // 컴파일러가 자동으로 기본 생성자를 넣어주지 않기 때문에 기본 생성자를 찾을 수 없어 컴파일 에러 발생함
        super(x, y); // 이 문장이 꼭 있어야 함
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
