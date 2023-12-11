package day16.NetworkTcp1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 ip주소 : " + address.getHostAddress());

        address = InetAddress.getByName("www.en-core.com");
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 ip주소 : " + address.getHostAddress());
        System.out.println("=======================================");

        byte[] addr = new byte[4];  // 192.168.0.80
        addr[0]= (byte) 192;
        addr[1]= (byte) 168;
        addr[2]= (byte) 0;
        addr[3]= (byte) 80;

        address = InetAddress.getByAddress(addr);  // IP주소가 됨.
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트의 정규화 된 이름 : " + address.getCanonicalHostName());
        System.out.println("로컬 호스트 ip주소 : " + address.getHostAddress());
        System.out.println("=======================================");

        InetAddress[] arr = InetAddress.getAllByName("www.google.com");

        for(InetAddress item : arr){
            System.out.println("로컬 호스트 이름 : " + item.getHostName());
            System.out.println("로컬 호스트 ip주소 : " + item.getHostAddress());
        }


    }
}
