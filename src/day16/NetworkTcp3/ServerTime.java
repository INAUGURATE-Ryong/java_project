package day16.NetworkTcp3;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {
    public static void main(String[] args) {
        int port = 7000;
        try {
            System.out.println("Server Start!!");
            ServerSocket ss = new ServerSocket(port); // socket 1

            while (true){  // 클라이언트가 누구든 들어올 수 있음.
                Socket s = ss.accept(); //socket 2
                OutputStream os = s.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);

                oos.writeObject( new Date());
                oos.flush();
                s.close();
            }
        } catch (Exception e){

        }
    }
}
