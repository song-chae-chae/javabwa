package ch05;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("[변경 전]");
        System.out.println("arr.length: " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        int[] temp = new int[arr.length * 2];
        // 배열 arr에 저장된 값 temp에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; // temp에 저장된 값을 arr에 저장 -> arr이 가리키고 있는 원래 배열과는 연결이 끊어지고 원래 배열은 JVM의 가비지 컬렉터에 의해 메모리에서 제거된다.

        System.out.println("[변경 후]");
        System.out.println("arr.length: " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
