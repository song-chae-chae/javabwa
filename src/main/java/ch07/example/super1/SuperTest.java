package ch07.example.super1;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();     // x = 10
                        // this.x = 10
                        // super.x = 10
    }
}
