package day16.NetworkTcp3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {// soket 1개 필요

    public static void main(String[] args) {
        Socket s = null;
        try{
            s = new Socket("192.168.0.40",9000); // server ip & port number
            //들어가고자 하는 아이피와 포트넘버
            // I / O
            InputStream is = s.getInputStream(); //read
            OutputStream os = s.getOutputStream();  //write

            String str = "안녕 이모";
            os.write(str.getBytes());

            byte[] buffer = new byte[100];
            is.read(buffer);
            System.out.println(new String(buffer));

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                s.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
