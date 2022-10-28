package ch09.example;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(123456789L);
        Person p2 = new Person(123456789L);

        if (p1 == p2) { // 주소값으로 비교
            System.out.println("p1 = p2");
        } else {
            System.out.println("p1 != p2");
        }

        if (p1.equals(p2)) { // 값으로 비교하도록 equals 오버라이딩 했음
            System.out.println("p1 = p2");
        } else
            System.out.println("p1 != p2");

    }
}

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person) obj).id;
        } else
            return false;
    }

    Person(long id) {
        this.id = id;
    }
}