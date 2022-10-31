package ch11.example;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id, password");
            System.out.println("id : ");
            String id = s.nextLine().trim();
            System.out.println("password : ");
            String password = s.nextLine().trim();

            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id 없음. 다시 입력");
                continue;
            }

            if (!(map.get(id)).equals(password)) {
                System.out.println("비밀번호 일치 안함. 다시 입력.");
            } else {
                System.out.println("로그인");
                break;
            }
        }
    }
}
