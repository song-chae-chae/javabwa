package ch09.example;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 3);
        Point copy = (Point) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}

class Point implements Cloneable { // cloneable 인터페이스 구현해야만 clone 호출 가능 - 인스턴스 데이터 보호 위해
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone(); // 반드시 예외처리 해줘야됨
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}