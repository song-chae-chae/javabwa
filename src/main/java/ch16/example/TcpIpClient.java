package ch16.example;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
    public static void main(String[] args) {
        try {
            String serverIp = "127.0.0.1";
            System.out.println("서버에 연결 중. 서버 Ip : " + serverIp);

            Socket socket = new Socket(serverIp, 7777);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
            System.out.println("연결 종료합니다.");

            dis.close();
            socket.close();
            System.out.println("연결 종료되었습니다.");
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
