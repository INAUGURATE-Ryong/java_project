package day17.NetworkTcp5;

import java.io.*;
import java.net.*;

public class ClientChat {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		String ip, str;

		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드로부터 입력 받기

		ps.print("서버의 IP 입력 ==> "); ip = br.readLine();
		ps.print("전송할 메시지  ==> "); str = br.readLine();

		byte[] buffer = str.getBytes("euc-kr");
		String message = new String(buffer, "euc-kr");

		Socket client = new Socket(ip, port);  // 서버의 IP 주소와 포트 번호로 소켓 생성
		OutputStream os = client.getOutputStream(); // 소켓을 통해 서버로 데이터 전송
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(message, 0, message.length());
		bw.flush();

		bw.close();
		client.close();
		ps.println(ip + " 로 메시지 전송 완료~~");
		ps.close();
	}
}
