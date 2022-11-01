package ch12.example;

public class AnnotationEx1 {
}

class Parent {
    void parentMethod() {}
}
class Child extends Parent {
    @Override
//    void parentmethod(){
//        // 조상 메서드 이름 잘못 적었는데 @Override 애너테이션 붙어있으면 알려줌
//    }
    void parentMethod() {

    }
}
