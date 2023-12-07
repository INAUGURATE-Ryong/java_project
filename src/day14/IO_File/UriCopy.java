package day14.IO_File;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
    public static void main(String[] args) throws MalformedURLException, IOException { //예외처리 위임
        URL url = new URL("https://www.google.com/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png");
        //읽기 객체 - FileInputStream
        InputStream is = url.openStream(); // 통로 연결
        //쓰기 객체 - FilesoutStream
        OutputStream os = new FileOutputStream("google.jpg"); // 상대경로

        byte[] buffer = new byte[1024*8];

        while (true){
            int inpudData = is.read(buffer);
            if(inpudData==-1) break;
            os.write(buffer,0,inpudData);
        }
        is.close(); os.close();
        System.out.println("웹에서 파일 복사 성공");

    }
}
