package ch07.example.point2;

public class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y) {
        // 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 자동으로 super();를 삽입
        // Point 클래스는 별도의 조상 없기 때문에 여기서 super()는 기본 조상 Object 클래스의 기본 생성자를 의미한다.
        this.x = x;
        this.y = y;
    }

}
