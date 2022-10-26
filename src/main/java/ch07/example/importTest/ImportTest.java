package ch07.example.importTest;

import java.text.SimpleDateFormat; // 어느 패키지에 속해있는지 명시 - import 문이 없으면 클래스 앞에 패키지명까지 붙여줘야 함
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }
}
