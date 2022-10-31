package ch11.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue(); // 저장한 순서에 관계없이 우선순위 높은 것부터 꺼냄
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq); // pq의 내부 배열 출력 [1, 2, 5, 3, 4]

        Object obj = null;

        // PriorityQueue에 저장된 요소 하나씩 꺼냄
        while ((obj = pq.poll()) != null)
            System.out.println(obj); // 12345

    }
}
