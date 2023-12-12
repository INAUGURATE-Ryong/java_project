package day17.NetworkChat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatClient {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE : java TcpMultiChatClient 대화명이 없습니다. ");
            System.exit(0);
        }
        try {
            String ip = "192.168.0.48"; // 자기자신 IP
            Socket s = new Socket(ip, 7777);
            System.out.println("서버에 연결 되었습니다. ");

            Thread send = new Thread(new ClientSender(s, args[0])); // inner class
            Thread reciever = new Thread(new ClientReciever(s)); //

            send.start();
            reciever.start();
        } catch (Exception e) {
            e.printStackTrace();
        }


    } // end main

    static class ClientSender extends Thread { //inner class
        Socket s;
        DataOutputStream dos;
        String name;
        public ClientSender(Socket s, String name){ // 매개변수 2개 생성자함수
            this.s =s;
            try {
                dos = new DataOutputStream(s.getOutputStream());
                this.name = name;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in); // 키보드로부터 입력 받기
            try {
                if (dos != null)
                    dos.writeUTF(name);
                while (dos != null)
                    dos.writeUTF("[" + name + "] " + sc.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    static class ClientReciever extends Thread{ //inner class
        Socket s;
        DataInputStream dis;
        public ClientReciever(Socket s){
            this.s =s;
            try {
                dis = new DataInputStream(s.getInputStream());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (dis != null) {
                try {
                    System.out.println(dis.readUTF());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } // run() end
    } // end ClientReciever
}
