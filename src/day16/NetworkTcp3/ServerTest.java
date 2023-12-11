package day16.NetworkTcp3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


//내가 서버를 오픈
public class ServerTest { // soket 2개 필요
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        System.out.println("Server start!!");
        try {
            ss = new ServerSocket(9000); // 0 ~1024 포트넘버는 예약되어 있음
            s = ss.accept(); // client socket  , 응답대기

            // I   /   O
            InputStream is = s.getInputStream(); //read
            OutputStream os = s.getOutputStream(); //write

            byte[] arr = new byte[100];
            is.read(arr);
            System.out.println( new String(arr) );

            String message = "안녕..client";
            os.write(message.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                s.close();
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }//inner try end s
        } // out try end
    }//main end
}
