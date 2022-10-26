package ch07.example.interfaceTest3;

public class InstanceManager {
    public static I getInstance() {
        return new B();
    }
}
