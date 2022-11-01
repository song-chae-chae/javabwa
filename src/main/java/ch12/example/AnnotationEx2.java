package ch12.example;

public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.oldField = 10;
        System.out.println(nc.getOldField());
    }
}

class NewClass {
    int newField;

    int getNewField() {
        return newField;
    }

    // 안쓰는거라고 알려줌
    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}


