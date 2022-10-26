package ch07.example.singleton;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
    }

    // 생성자를 통해 직접 인스턴스 생성하지 못하게 하고 public 메서드를 통해 인스턴스에 접근하게 함으로써 사용할 수 있는 인스턴스의 개수 제한 가능
    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
        return s;
    }
}
