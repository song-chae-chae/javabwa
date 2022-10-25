package ch06.example;

class TvTest {
    public static void main(String[] args) {
        Tv t; // Tv인스턴스 참조 위한 참조 변수 t
        t = new Tv(); // Tv 인스턴스 생성
        t.channel = 7; // 멤버변수 channel 의 값을 7로 set
        t.channelDown(); // Tv 인스턴스의 channelDown 메서드 호출
        System.out.println("현재 채녈은 " + t.channel + " 입니다.");
    }
}

