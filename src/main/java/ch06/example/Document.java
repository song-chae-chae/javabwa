package ch06.example;

public class Document {
    static int count = 0;
    String name;

    Document() {   // 문서 생성 시 문서명 지정하지 않았을 때 -> 제목없음 + count로 지정 
        this("제목없음" + count++);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}
