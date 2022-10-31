package ch11.example;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        Object obj = peek();
        removeElementAt(size() - 1);
        return obj;
    }

    public Object peek() {
        int len = size();

        if (len == 0) {
            throw new EmptyStackException();
        }
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o); // 끝에서부터 찾는다. 반환값은 저장된 위치(배열 index)

        if (i >= 0) { // 객체 있는 경우
            return size() - 1; // Stack은 맨 위에 저장된 객체의 index를 1로 정의한다.
        }
        return -1;
    }
}
