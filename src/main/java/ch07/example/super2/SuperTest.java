package ch07.example.super2;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();     // x = 20
                        // this.x = 20
                        // super.x = 10
    }
}
