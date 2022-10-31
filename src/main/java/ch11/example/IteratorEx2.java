package ch11.example;


import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList orginal = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for(int i = 0; i < 10; i++) {
            orginal.add(i + "");
        }

        Iterator it = orginal.iterator();

        while(it.hasNext()) {
            copy1.add(it.next());
        }

        System.out.println("= original -> copy1 복사");
        System.out.println("original : " + orginal);
        System.out.println("copy1 : " + copy1);

        System.out.println();

        it = orginal.iterator(); // iterator는 재사용 안되므로 다시 얻어와야 함

        while(it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }
        System.out.println("= original -> copy2 이동");
        System.out.println("original : " + orginal);
        System.out.println("copy2 : " + copy2);
    }
}
