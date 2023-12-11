package day16.NetworkTcp1;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 네트워크는 예외처리가 많다.
public class MainEntry {
    public static void main(String[] args) {
        String host = "192.168.0.80";
        try {
            InetAddress[] address = InetAddress.getAllByName(host);
            for(InetAddress item : address){
                System.out.println(item);
                System.out.println(item.getCanonicalHostName());  //컴퓨터 이름 출력
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
