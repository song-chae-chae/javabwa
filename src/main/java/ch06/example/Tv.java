package ch06.example;

public class Tv {
    // Tv의 속성 (멤버변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능 (메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
