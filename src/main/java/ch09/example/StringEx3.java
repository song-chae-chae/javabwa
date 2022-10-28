package ch09.example;

public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0]; // {} 
        String s = new String(cArr); // new String("") 와 같음

        System.out.println("cArr.length=" + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
