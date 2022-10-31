package ch11.example;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue 인터페이스의 구현체인 LinkedList 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("== Stack ==");
        while (!st.empty()) {
            System.out.println(st.pop()); // pop : 맨 위에 저장된 객체 꺼냄
        }

        System.out.println("== Queue ==");
        while (!q.isEmpty()) {
            System.out.println(q.poll()); // 객체 꺼내서 반환
        }
    }
}
