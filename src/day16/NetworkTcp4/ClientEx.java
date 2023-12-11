package day16.NetworkTcp4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientEx {
    public static void main(String[] args) {
        BufferedReader br = null, stin = null;
        BufferedWriter bw = null;
        Socket client = null; // socket 2

        try{
            client = new Socket("127.0.0.1",9999);
            br = new BufferedReader(new InputStreamReader(client.getInputStream())); // 네트워크를 통해서 데이터 읽어옴
            //키보드로부터 입력 스트림
            stin = new BufferedReader(new InputStreamReader(System.in));
            //클라이언트로의 출력 스트림
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            String outputMessage;

            while (true){
                System.out.println("message input : ");
                outputMessage = stin.readLine();
                if(outputMessage.equalsIgnoreCase("exit")){
                    bw.write(outputMessage);
                    bw.flush();
                    break;
                }

                bw.write(client.getInetAddress()+"클라이언트> "+ outputMessage + "\n");
                bw.flush();

                String inputMessge = br.readLine();
                System.out.println(inputMessge);
            } // while end

        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try{
                client.close();
            }catch (Exception e2){
                System.out.println("서버와의 채팅 중 오류 발생........");
            }
        }  // try end

    }
}
