package ch14.example;

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {
        }; // MyFunction2 f = (MyFunction2)(() -> {});
        Object obj = (MyFunction2) (() -> {
        }); // Object 타입으로 형변환 생략됨
        String str = ((Object) (MyFunction2) (() -> {
        })).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction2) (() -> {
        }));
        // System.out.println((MyFunction2)(() ->{}).toString()); // error
        System.out.println(((Object) (MyFunction2) (() -> {
        })).toString());

        // 일반적인 익명 객체는 객체 타입이 '외부클래스$번호'
        // 람다는 '외부클래스$$LambdaEx3$번호'
    }
}

@FunctionalInterface
interface MyFunction2 {
    void myMethod(); // public abstract void myMethod();
}
