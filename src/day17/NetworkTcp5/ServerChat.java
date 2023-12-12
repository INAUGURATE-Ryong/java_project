package day17.NetworkTcp5;

import java.io.*;
import java.net.*;

public class ServerChat {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		ServerSocket ss = new ServerSocket(port);
		System.out.println("채팅 서버 시작");

		while (true) {
			Socket s = ss.accept();
			InputStream is = s.getInputStream();  // 입력 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "euc-kr"));
			PrintStream ps = new PrintStream(System.out);

			ps.print(s.getInetAddress().getHostAddress());  // 클라이언트의 IP 주소 출력
			String str = br.readLine();
			byte[] buffer = str.getBytes("euc-kr");   // or UTF-8
			String message = new String(buffer, "euc-kr");

			ps.print("     :  받은 메시지 =====>  " + message);

			br.close();
			s.close();
		} // while end
	}
}
