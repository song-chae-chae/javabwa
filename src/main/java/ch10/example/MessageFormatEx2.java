package ch10.example;

import java.text.MessageFormat;

public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        // ' -> MessageFormat의 양식에 escape 문자로 사용됨
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'');";

        Object[][] arguments = {
                {"이자바", "02-123-1234", "26", "07-09"},
                {"김프로", "032-333-1234", "44", "10-07"}
        };
        for (int i = 0; i < arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
