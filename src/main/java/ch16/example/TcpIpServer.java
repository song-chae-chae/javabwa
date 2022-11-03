package ch16.example;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + " 서버 준비됨");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                System.out.println(getTime() + " 연결요청을 기다립니다.");

                // 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다림
                // 클라이언트의 연결요청이 오면 클라소켓과 통신할 새로운 소켓 생성함
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + " 로부터 연결 요청이 들어옴");

                // 소켓의 출력스트림 얻기
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                // 원격 소켓(remote socket)에 데이터 보냄
                dos.writeUTF("[Notice] Test Message1 from Server");
                System.out.println(getTime() + " 데이터를 전송했습니다.");

                dos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
