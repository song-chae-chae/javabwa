package ch05;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];

        // arraycopy(인수5) : 어느 배열(1)의 몇 번째(2)에서 어느 배열(3)의 몇 번째 요소(4)로 몇 개의 값(5)을 복사할 것인지 지정
        System.arraycopy(abc, 0, result, 0, abc.length); // result : A B C D
        System.arraycopy(num, 0, result, abc.length, num.length); // result : A B C D 0 1 2 3 4 5 6 7 8 9
        System.out.println(result); // ABCD0123456789

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num); // ABCD456789

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num); //  ABCD45ABC9
    }
}
