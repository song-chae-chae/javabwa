package ch06.example;

public class BlockTest {
    static {
        System.out.println("static {}"); // 클래스 초기화 블럭
        // BlockTest 클래스 메모리에 로딩될 때 클래스 초기화 블럭이 가장 먼저 수행됨
    }
    {
        System.out.println("{}"); // 인스턴스 초기화 블럭 - 인스턴스 생성될 때마다 수행됨
    }
    
    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest2(); ");
        BlockTest bt2 = new BlockTest();
        
        // 멤버변수 초기화 시기, 순서
        // 클래스 변수 초기화 시점 - 클래스 로딩 시 한번
        // 클래스 변수 초기화 순서 - 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
        
        // 인스턴스 변수 초기화 시점 - 인스턴스 생성될 때마다 각 인스턴스 별 초기화
        // 인스턴스 변수 초기화 순서 - 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
    }
}
