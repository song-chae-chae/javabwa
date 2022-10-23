package ch01;

// 소스 파일의 이름과 해당 소스 파일의 public class의 이름은 일치해야 한다.
// public 클래스가 없는 경우 소스 파일의 이름은 자유롭게 지어도 된다.
// 소스 파일과 달리 클래스 파일은 클래스마다 하나씩 만들어진다
// 따라서 하나의 소스 파일 안에 두 개의 클래스 (ex) Hello, Hello2 가 있다면
// 컴파일 시 클래스 파일은 Hello.class, Hello2.class 로 두 개가 된다.

/*
* Date : 2022.10.23
* Source : Hello.java
* Author: Chaechae
* */
public class Hello {
    public static void main(String[] args) { // 메인 메서드 선언부
        // 자바 프로그램 실행 과정
        // 1. java 파일 작성 (소스 파일)
        // 2. javac.exe (자바 컴파일러)가 컴파일 함 -> 클래스 파일 생성됨
        // 3. java.exe (자바 인터프리터)로 실행

        System.out.println("Hello, World.");
    }
}
