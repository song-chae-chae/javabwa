package ch07.example.tv2;

public class TVCR extends Tv { // 다중 상속 안되므로 관계를 맺고 싶은 클래스를 하나는 상속, 하나는 포함시킴
    VCR vcr = new VCR(); // VCR 클래스 멤버변수에 포함

    // 외부적으로는 TVCR클래스의 인스턴스를 사용하는 것 같지만 내부적으로는 VCR 클래스의 인스턴스를 생성해서 사용
    // VCR 메서드 내용 변경되더라도 TVCR 클래스의 메서드들도 변경된 내용 적용되는 결과 얻음
    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}
